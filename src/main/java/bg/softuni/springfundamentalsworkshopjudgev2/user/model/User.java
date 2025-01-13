package bg.softuni.springfundamentalsworkshopjudgev2.user.model;

import bg.softuni.springfundamentalsworkshopjudgev2.comment.model.Comment;
import bg.softuni.springfundamentalsworkshopjudgev2.homework.model.Homework;
import bg.softuni.springfundamentalsworkshopjudgev2.role.model.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "git", nullable = false, unique = true)
    private String git;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "author")
    private List<Homework> homework;

    @OneToMany(mappedBy = "author")
    private List<Comment> comments;

}
