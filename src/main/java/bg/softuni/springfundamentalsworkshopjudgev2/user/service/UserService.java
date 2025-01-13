package bg.softuni.springfundamentalsworkshopjudgev2.user.service;

import bg.softuni.springfundamentalsworkshopjudgev2.web.dto.UserLoginRequest;
import bg.softuni.springfundamentalsworkshopjudgev2.web.dto.UserRegisterRequest;

public interface UserService {

    void login(UserLoginRequest userLoginRequest);

    String register(UserRegisterRequest userRegisterRequest);
}
