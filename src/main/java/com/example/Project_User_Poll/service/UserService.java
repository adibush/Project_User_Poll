package com.example.Project_User_Poll.service;

import com.example.Project_User_Poll.model.User;

import java.util.List;

public interface UserService {

    void postUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();
}
