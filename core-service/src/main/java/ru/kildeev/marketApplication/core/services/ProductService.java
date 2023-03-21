package ru.kildeev.marketApplication.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kildeev.marketApplication.core.api.ProductDto;
import ru.kildeev.marketApplication.core.converters.ProductConverter;
import ru.kildeev.marketApplication.core.entities.Product;
import ru.kildeev.marketApplication.core.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public ProductDto getProductById(Long productId) {
        return productConverter.entityToDto(productRepository.findById(productId).get());
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
