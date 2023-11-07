package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.model.Product;
import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.protobuf.product.*;
import dk.via.slaughterhouse.repository.ProductRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GRpcService
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver) {
        Product product = new Product();
        Tray tray = new Tray();
        tray.setId(request.getTrayId());
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setTray(tray);
        Product resProduct = productRepository.save(product);

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
        Optional<Product> product = productRepository.findById(request.getId());
        Tray tray = new Tray();
        tray.setId(product.get().getTray().getId());

        GetProductResponse.Builder builder = GetProductResponse.newBuilder();
        builder.setId(product.get().getId());
        builder.setName(product.get().getName());
        builder.setDescription(product.get().getDescription());
        builder.setTrayId(tray.getId());

        GetProductResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getProductIds(GetProductIdsRequest request, StreamObserver<GetProductIdsResponse> responseObserver) {
        List<Long> list = productRepository.findProductIdsByAnimalId(request.getAnimalId());

        GetProductIdsResponse.Builder builder = GetProductIdsResponse.newBuilder();

        for (Long id : list) {
            builder.addProductIds(id);
        }

        GetProductIdsResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
