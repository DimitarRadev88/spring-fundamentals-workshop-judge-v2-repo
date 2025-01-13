package bg.softuni.springfundamentalsworkshopjudgev2.web.controller;

import bg.softuni.springfundamentalsworkshopjudgev2.user.service.UserService;
import bg.softuni.springfundamentalsworkshopjudgev2.web.dto.UserLoginRequest;
import bg.softuni.springfundamentalsworkshopjudgev2.web.dto.UserRegisterRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String getUserLogin() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView userLogin(
            @Valid UserLoginRequest userLoginRequest,
            BindingResult bindingResult,
            ModelAndView modelAndView
    ) {
        System.out.println();
        if (!bindingResult.hasErrors()) {
            modelAndView.setViewName("redirect:/home");
        }

        userService.login(userLoginRequest);

        return modelAndView;
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @PostMapping("/register")
    public ModelAndView userRegister(
            @Valid UserRegisterRequest userRegisterRequest,
            BindingResult bindingResult,
            ModelAndView modelAndView
    ) {

        if (!bindingResult.hasErrors()) {
            String username = userService.register(userRegisterRequest);
            modelAndView.setViewName("redirect:/login");
            modelAndView.getModel().put("username", username);
        }

        return modelAndView;
    }

}
