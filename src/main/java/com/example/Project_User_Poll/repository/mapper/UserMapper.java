package com.example.Project_User_Poll.repository.mapper;

import com.example.Project_User_Poll.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("address"),
                rs.getString("date_time"));
    }




//    @Override
//    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Student(rs.getInt("id"),
//                rs.getString("first_name"),
//                rs.getString("last_name"),
//                rs.getString("email"),
//                StudentPaymentMethod.valueOf(rs.getString("student_payment_method")));
//    }
}
