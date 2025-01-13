package bg.softuni.springfundamentalsworkshopjudgev2.role.model;

import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private RoleType name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

}
