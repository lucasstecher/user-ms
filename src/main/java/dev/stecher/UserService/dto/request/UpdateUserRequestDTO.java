package dev.stecher.UserService.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UpdateUserRequestDTO {

    @Size(max = 100)
    private String name;

    @Email
    @Size(max = 255)
    private String email;

    public String  getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
