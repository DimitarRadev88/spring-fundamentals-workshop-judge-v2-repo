package bg.softuni.springfundamentalsworkshopjudgev2.homework.repository;

import bg.softuni.springfundamentalsworkshopjudgev2.homework.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkRepository extends JpaRepository<Homework, String> {
}
