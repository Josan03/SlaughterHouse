package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.dao.interfaces.ProductDAO;
import dk.via.slaughterhouse.model.Product;
import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.protobuf.product.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public void createProduct(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver) {
        Product product = new Product();
        Tray tray = new Tray();
        tray.setId(request.getTrayId());
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setTray(tray);
        Product resProduct = productDAO.createProduct(product);

        CreateProductResponse.Builder builder = CreateProductResponse.newBuilder();

        if (resProduct == null) {
            builder.setConfirmation("Product could not be created");
        } else {
            builder.setConfirmation("Product created");
        }

        CreateProductResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getProduct(GetProductRequest request, StreamObserver<GetProductResponse> responseObserver) {
        Product product = productDAO.getProduct(request.getId());
        Tray tray = new Tray();
        tray.setId(product.getTray().getId());

        GetProductResponse.Builder builder = GetProductResponse.newBuilder();
        builder.setId(product.getId());
        builder.setName(product.getName());
        builder.setDescription(product.getDescription());
        builder.setTrayId(tray.getId());

        GetProductResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getProductIds(GetProductIdsRequest request, StreamObserver<GetProductIdsResponse> responseObserver) {
        List<Long> list = productDAO.findProductIdsByAnimalId(request.getAnimalId());

        GetProductIdsResponse.Builder builder = GetProductIdsResponse.newBuilder();

        for (Long id : list) {
            builder.addProductIds(id);
        }

        GetProductIdsResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
