package ru.kildeev.marketApplication.core.converters;

import org.springframework.stereotype.Component;
import ru.kildeev.marketApplication.core.api.ProductDto;
import ru.kildeev.marketApplication.core.entities.Product;

@Component
public class ProductConverter {

    public ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setCompany(product.getCompany().getTitle());
        productDto.setDiscount(product.getDiscount().getAmount().toString());
//        productDto.setFeedback(product.getFeedback());
        productDto.setHashtags(product.getHashtags());
        productDto.setId(product.getId());
        productDto.setPrice(product.getPrice());
        productDto.setRemains(product.getRemains());
        productDto.setScore(product.getScore());
        productDto.setRemains(product.getRemains());
        productDto.setSpecifications(product.getSpecifications());
        return productDto;
    }

    public Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
//        product.setCompany(productDto.getCompany());
//        product.setDiscount(productDto.getDiscount());
//        product.setFeedback(productDto.getFeedback());
//        product.setHashtags(productDto.getHashtags());
        product.setId(productDto.getId());
        product.setPrice(productDto.getPrice());
        product.setRemains(productDto.getRemains());
        product.setScore(productDto.getScore());
        product.setRemains(productDto.getRemains());
        product.setSpecifications(productDto.getSpecifications());
        return product;
    }
}
