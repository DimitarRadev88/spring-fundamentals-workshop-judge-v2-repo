package bg.softuni.springfundamentalsworkshopjudgev2.user.repository;

import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsername(String username);

}
