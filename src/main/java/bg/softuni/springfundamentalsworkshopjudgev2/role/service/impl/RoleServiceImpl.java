package bg.softuni.springfundamentalsworkshopjudgev2.role.service.impl;

import bg.softuni.springfundamentalsworkshopjudgev2.role.repository.RoleRepository;
import bg.softuni.springfundamentalsworkshopjudgev2.role.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

}
