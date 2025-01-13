package bg.softuni.springfundamentalsworkshopjudgev2.role.service;

import bg.softuni.springfundamentalsworkshopjudgev2.role.model.Role;
import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import org.springframework.transaction.annotation.Transactional;

public interface RoleService {

    Role getNewAdministrator();

    Role getNewUser();

}
