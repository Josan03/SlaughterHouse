package dk.via.slaughterhouse.dao.interfaces;

import dk.via.slaughterhouse.model.Product;

import java.util.List;

public interface ProductDAO {
    Product createProduct(Product product);
    Product getProduct(Long id);
    List<Long> findProductIdsByAnimalId(Long id);
}
