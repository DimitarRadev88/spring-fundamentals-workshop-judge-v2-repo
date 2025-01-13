package bg.softuni.springfundamentalsworkshopjudgev2.exercise.model;

import bg.softuni.springfundamentalsworkshopjudgev2.homework.model.Homework;
import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.List;

import java.time.LocalDateTime;

@Entity
@Table(name = "exercises")
@NoArgsConstructor
@Getter
@Setter
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "started_on", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @PastOrPresent(message = "The date cannot be in the future")
    private LocalDateTime startedOn;

    @Column(name = "due_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @PastOrPresent(message = "The date cannot be in the past")
    private LocalDateTime dueDate;

    @OneToMany(mappedBy = "exercise")
    private List<Homework> homeworks;

}
