package ru.kildeev.marketApplication.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kildeev.marketApplication.core.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByUsernameAndProduct(String username, String productTitle);
}
