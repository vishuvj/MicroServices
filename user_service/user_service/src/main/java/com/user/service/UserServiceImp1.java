package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp1 implements UserService {

    // fake user list
    List<User> list = List.of(
            new User(1311L, "Vishal Thakur", "1234567"),
            new User(1312L, "Rajat Thakur", "12999000"),
            new User(1313L, "Raj Thakur", "1233337")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
