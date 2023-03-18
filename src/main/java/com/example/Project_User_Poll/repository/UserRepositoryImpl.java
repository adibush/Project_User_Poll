package com.example.Project_User_Poll.repository;

import com.example.Project_User_Poll.model.User;
import com.example.Project_User_Poll.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String USER_TABLE_NAME = "users";

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void postUser(User user) {
        String sql = String.format("INSERT INTO %s (first_name,last_name,email,age,address)VALUES(?,?,?,?,?)", USER_TABLE_NAME);
        jdbcTemplate.update(sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getAddress());
    }

    @Override
    public void deleteUser(int id) {
        String sql = String.format("DELETE FROM %s WHERE id = ?", USER_TABLE_NAME);
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void updateUser(User user) {
        String sql = String.format("UPDATE %s SET first_name=?,last_name=?,email=?,age=?,address=? WHERE id=?", USER_TABLE_NAME);
        jdbcTemplate.update(sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getAddress(),
                user.getId());
    }

    @Override
    public User getUserById(int id) {
        String sql = String.format("SELECT * FROM %s WHERE id=?", USER_TABLE_NAME);
        try {
            User user = jdbcTemplate.queryForObject(sql, new UserMapper(), id);
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        String sql = String.format("SELECT * FROM %s", USER_TABLE_NAME);
        try {
            return jdbcTemplate.query(sql, new UserMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }
}

