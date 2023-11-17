package dk.via.slaughterhouse.dao.implementations;

import dk.via.slaughterhouse.dao.interfaces.ProductDAO;
import dk.via.slaughterhouse.model.Product;
import dk.via.slaughterhouse.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Long> findProductIdsByAnimalId(Long id) {
        return productRepository.findProductIdsByAnimalId(id);
    }
}
