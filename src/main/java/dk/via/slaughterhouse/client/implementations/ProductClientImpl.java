package dk.via.slaughterhouse.client.implementations;

import dk.via.slaughterhouse.client.interfaces.ProductClient;
import dk.via.slaughterhouse.dto.ProductDTO;
import dk.via.slaughterhouse.model.Product;
import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.protobuf.product.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class ProductClientImpl implements ProductClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
    private ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);

    @Override
    public String createProduct(ProductDTO productDTO) {
        CreateProductRequest req = CreateProductRequest.newBuilder()
                .setName(productDTO.getName())
                .setDescription(productDTO.getDescription())
                .setTrayId(Long.parseLong(productDTO.getTrayId()))
                .build();

        CreateProductResponse res = stub.createProduct(req);
        return res.getConfirmation();
    }

    @Override
    public Product getProduct(Long productId) {
        GetProductRequest req = GetProductRequest.newBuilder()
                .setId(productId)
                .build();

        GetProductResponse res = stub.getProduct(req);
        Tray tray = new Tray();
        tray.setId(res.getTrayId());
        return new Product(res.getId(), res.getName(), res.getDescription(), tray);
    }

    @Override
    public List<Long> getProducts(Long animalId) {
        GetProductIdsRequest req = GetProductIdsRequest.newBuilder()
                .setAnimalId(animalId)
                .build();

        GetProductIdsResponse res = stub.getProductIds(req);
        return res.getProductIdsList();
    }
}
