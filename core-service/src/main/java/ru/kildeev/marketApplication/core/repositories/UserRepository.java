package ru.kildeev.marketApplication.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kildeev.marketApplication.core.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
