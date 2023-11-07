package dk.via.slaughterhouse.client.interfaces;

import dk.via.slaughterhouse.dto.ProductDTO;
import dk.via.slaughterhouse.model.Product;

import java.util.List;

public interface ProductClient {
    String createProduct(ProductDTO productDTO);
    Product getProduct(Long productId);
    List<Long> getProducts(Long animalId);
}
