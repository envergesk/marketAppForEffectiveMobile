package ru.kildeev.marketApplication.core.entities;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Data
@Table(name = "products")
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "remains")
    private Integer remains;

    @OneToMany(mappedBy = "product")
    private List<Comment> comments;

    @ManyToMany
    @JoinTable(name = "products_hashtags",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "hashtag_id"))
    private List<Hashtag> hashtags;

    @Column(name = "specifications")
    private String specifications;

    @Column(name = "score")
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

}
//- Названия;
//        - Описания;
//        - Организации;
//        - Цены;
//        - Количества на складе;
//        - Информации о скидах;
//        - Отзывов;
//        - Ключевых слов;
//        - Таблицы характеристик;
//        - Оценок.