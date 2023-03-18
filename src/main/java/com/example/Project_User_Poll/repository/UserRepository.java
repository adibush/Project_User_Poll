package com.example.Project_User_Poll.repository;

import com.example.Project_User_Poll.model.User;

import java.util.List;

public interface UserRepository {

    void postUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUserById(int id);

    List<User> getAllUsers();




}
