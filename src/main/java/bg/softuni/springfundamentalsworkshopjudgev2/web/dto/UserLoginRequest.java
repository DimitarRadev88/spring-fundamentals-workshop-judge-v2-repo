package bg.softuni.springfundamentalsworkshopjudgev2.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserLoginRequest(
        @NotBlank
        @Size(min = 2, message = "Username must be more than 2 characters")
        String username,
        @NotBlank
        @Size(min = 3, message = "Password must be more than 3 characters")
        String password
) {}
