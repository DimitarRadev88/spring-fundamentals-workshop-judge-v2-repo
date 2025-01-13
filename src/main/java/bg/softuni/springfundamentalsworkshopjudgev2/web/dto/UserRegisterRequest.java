package bg.softuni.springfundamentalsworkshopjudgev2.web.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserRegisterRequest {
        @NotBlank
        @Size(min = 2, message = "Username length must be minimum 2 characters!")
        String username;
        @NotBlank
        @Size(min = 3, message = "Password length must be minimum 3 characters!")
        String password;
        String confirmPassword;
        @NotBlank
        @Email(message = "Enter valid email!")
        String email;
        @NotBlank
        @Pattern(regexp = "https:/github.com/./SpringTestData/.")
        String git;

}

