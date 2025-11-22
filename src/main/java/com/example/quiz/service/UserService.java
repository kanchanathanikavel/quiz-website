package com.example.quiz.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.quiz.entity.User;
import com.example.quiz.entity.UserAnswer;
import com.example.quiz.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // ✅ Register new user (Admin or Participant)
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // ✅ Find user by email (used in login)
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // ✅ List all users (optional)
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Object saveAllAnswers(List<UserAnswer> inputAnswers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAnswers'");
    }

    public Object getAllAnswers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAnswers'");
    }
}

