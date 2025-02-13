package com.example.service;

import com.example.model.User;
import com.example.repository.elasticsearch.UserSearchRepository;
import com.example.repository.jpa.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserSearchRepository userSearchRepository;

    public UserService(UserRepository userRepository, UserSearchRepository userSearchRepository) {
        this.userRepository = userRepository;
        this.userSearchRepository = userSearchRepository;
    }

    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        userSearchRepository.save(savedUser);
        return savedUser;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
