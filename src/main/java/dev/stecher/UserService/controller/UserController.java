package dev.stecher.UserService.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users/")
public class UserController {

    @GetMapping
    public String getAllUsers() { // ADMIN
        return "All users listed";
    }

    @GetMapping("me")
    public String getUser() { // authenticated
        return "Get the user that sent the request";
    }

    @GetMapping("{id}")
    public String getUserById() { // SELF, ADMIN
        return "Get user by id";
    }

    @PatchMapping("{id}")
    public String updateUserById() { // SELF
        return "update user by id";
    }

    @DeleteMapping("{id}")
    public String deleteUserById() { // ADMIN
        return "delete user by id";
    }
}
