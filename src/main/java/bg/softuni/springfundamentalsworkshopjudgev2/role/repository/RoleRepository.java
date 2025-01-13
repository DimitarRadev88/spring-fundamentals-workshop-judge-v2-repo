package bg.softuni.springfundamentalsworkshopjudgev2.role.repository;

import bg.softuni.springfundamentalsworkshopjudgev2.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
