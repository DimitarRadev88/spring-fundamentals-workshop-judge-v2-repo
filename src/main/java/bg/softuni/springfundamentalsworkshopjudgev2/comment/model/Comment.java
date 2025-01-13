package bg.softuni.springfundamentalsworkshopjudgev2.comment.model;

import bg.softuni.springfundamentalsworkshopjudgev2.homework.model.Homework;
import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "score", nullable = false)
    private Integer score;

    @Column(name = "text_content", columnDefinition = "TEXT")
    private String textContent;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "homework_id")
    private Homework homework;

}
