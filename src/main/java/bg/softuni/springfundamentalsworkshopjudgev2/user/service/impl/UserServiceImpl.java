package bg.softuni.springfundamentalsworkshopjudgev2.user.service.impl;

import bg.softuni.springfundamentalsworkshopjudgev2.role.model.Role;
import bg.softuni.springfundamentalsworkshopjudgev2.role.model.RoleType;
import bg.softuni.springfundamentalsworkshopjudgev2.role.service.RoleService;
import bg.softuni.springfundamentalsworkshopjudgev2.user.model.User;
import bg.softuni.springfundamentalsworkshopjudgev2.user.repository.UserRepository;
import bg.softuni.springfundamentalsworkshopjudgev2.user.service.UserService;
import bg.softuni.springfundamentalsworkshopjudgev2.web.dto.UserLoginRequest;
import bg.softuni.springfundamentalsworkshopjudgev2.web.dto.UserRegisterRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleService roleService, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void login(UserLoginRequest userLoginRequest) {
        Optional<User> user = userRepository.findByUsername(userLoginRequest.username());

        if (user.isEmpty()) {
            throw new IllegalArgumentException("Username does not exist in the database");
        }

        if (!user.get().getPassword().equals(userLoginRequest.password())) {
            throw new IllegalArgumentException("Incorrect password");
        }

        //todo Create User Session

    }

    @Override
    public String register(UserRegisterRequest userRegisterRequest) {
        User user = modelMapper.map(userRegisterRequest, User.class);

        if (userRepository.count() == 0 || userRepository.count() % 100 == 0) {
           user.setRole(roleService.getNewAdministrator());
        } else {
            roleService.getNewUser();
        }

        return userRepository.save(user).getUsername();
    }
}
