package com.example.Project_User_Poll.controller;

import com.example.Project_User_Poll.model.User;
import com.example.Project_User_Poll.service.UserService;
import io.micrometer.core.instrument.config.validate.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService service;


    @PostMapping(value = "/create")
    public String createUser(@RequestBody User user) {
        service.postUser(user);
        return "user created";
    }

    @PutMapping(value = "/update")
    public String updateUser(@RequestBody User user) {
        service.updateUser(user);
        return "user updated";
    }

    @DeleteMapping(value = "/delete")
    public String deleteUser(@RequestParam int id) {
        service.deleteUser(id);
        return "user deleted";
    }

    @GetMapping(params = "id")
    public User getUserById(@RequestParam int id) {
        return service.getUserById(id);

    }

    @GetMapping()
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }


}
