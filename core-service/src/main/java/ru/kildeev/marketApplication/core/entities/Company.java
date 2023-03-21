package ru.kildeev.marketApplication.core.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "companies")
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "logo")
    private String logo; //TODO: string to file/picture?

    @OneToMany(mappedBy = "company")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;




    //TODO: isRegistered()
}
