package bg.softuni.springfundamentalsworkshopjudgev2.homework.model;

import bg.softuni.springfundamentalsworkshopjudgev2.exercise.model.Exercise;
import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "homework")
@NoArgsConstructor
@Getter
@Setter
public class Homework {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "added_on", nullable = false)
    private LocalDateTime addedOn;

    @Column(name = "git_address", nullable = false, unique = true)
    private String gitAddress;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

}
