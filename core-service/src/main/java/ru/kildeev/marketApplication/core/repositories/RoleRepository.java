package ru.kildeev.marketApplication.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kildeev.marketApplication.core.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByTitle(String title);
}
