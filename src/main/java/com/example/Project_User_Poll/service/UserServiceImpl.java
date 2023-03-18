package com.example.Project_User_Poll.service;

import com.example.Project_User_Poll.model.User;
import com.example.Project_User_Poll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;


    @Override
    public void postUser(User user) {
        repository.postUser(user);
    }

    @Override
    public void deleteUser(int id) {
        repository.deleteUser(id);

    }

    @Override
    public void updateUser(User user) {
        repository.updateUser(user);

    }

    @Override
    public User getUserById(int id) {
        return repository.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }
}
