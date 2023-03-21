package ru.kildeev.marketApplication.core.entities;

import javax.persistence.*;

import java.util.List;

public class Specification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "logo")
    private String logo; //TODO: string to file/picture?

    @OneToMany(mappedBy = "company")
    private List<Product> products;
}
