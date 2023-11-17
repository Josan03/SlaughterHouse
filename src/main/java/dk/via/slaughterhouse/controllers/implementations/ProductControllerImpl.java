package dk.via.slaughterhouse.controllers.implementations;

import dk.via.slaughterhouse.client.implementations.ProductClientImpl;
import dk.via.slaughterhouse.client.interfaces.ProductClient;
import dk.via.slaughterhouse.controllers.interfaces.ProductController;
import dk.via.slaughterhouse.dto.ProductDTO;
import dk.via.slaughterhouse.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductControllerImpl implements ProductController {
    private ProductClient productClient;

    public ProductControllerImpl() {
        this.productClient = new ProductClientImpl();
    }

    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody ProductDTO dto) {
        try {
            String res = productClient.createProduct(dto);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
        try {
            Product product = productClient.getProduct(id);
            if (product != null) {
                return new ResponseEntity<>(product, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<List<Long>> getProductsIds(@PathVariable("id") Long id) {
        try {
            List<Long> products = productClient.getProducts(id);
            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
