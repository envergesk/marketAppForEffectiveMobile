package ru.kildeev.marketApplication.core.entities;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "discounts")
@NoArgsConstructor
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "end_dt")
    private Timestamp endDt;

    @OneToMany(mappedBy = "discount")
    private List<Product> products;
}
