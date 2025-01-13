package bg.softuni.springfundamentalsworkshopjudgev2.role.service.impl;

import bg.softuni.springfundamentalsworkshopjudgev2.role.model.Role;
import bg.softuni.springfundamentalsworkshopjudgev2.role.model.RoleType;
import bg.softuni.springfundamentalsworkshopjudgev2.role.repository.RoleRepository;
import bg.softuni.springfundamentalsworkshopjudgev2.role.service.RoleService;
import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import bg.softuni.springfundamentalsworkshopjudgev2.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public Role getNewAdministrator() {
        Role role = new Role();
        role.setName(RoleType.ADMIN);
        return roleRepository.save(role);
    }

    @Override
    public Role getNewUser() {
        Role role = new Role();
        role.setName(RoleType.USER);
        return roleRepository.save(role);
    }
}
