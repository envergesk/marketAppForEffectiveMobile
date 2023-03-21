package ru.kildeev.marketApplication.core.entities;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "orders")
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "product")
    private String product;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "total_price")
    private BigDecimal totalPrice;


}
