package ru.kildeev.marketApplication.core.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kildeev.marketApplication.core.entities.Hashtag;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;
    private String title;
    private String company;
    private BigDecimal price;
    private Integer remains;
    private String discount;
    private String feedback;
    private List<Hashtag> hashtags;
    private String specifications;
    private Integer score;
}
