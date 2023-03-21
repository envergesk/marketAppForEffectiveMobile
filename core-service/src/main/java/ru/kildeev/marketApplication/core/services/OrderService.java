package ru.kildeev.marketApplication.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kildeev.marketApplication.core.entities.Order;
import ru.kildeev.marketApplication.core.repositories.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }
}
