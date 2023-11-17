package dk.via.slaughterhouse.controllers.interfaces;

import dk.via.slaughterhouse.dto.ProductDTO;
import dk.via.slaughterhouse.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductController {
    ResponseEntity<String> createProduct(ProductDTO dto);
    ResponseEntity<Product> getProductById(Long id);
    ResponseEntity<List<Long>> getProductsIds(Long id);
}
