package com.example.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quiz.entity.QuizAttempt;
import com.example.quiz.entity.User;

public interface QuizAttemptRepository extends JpaRepository<QuizAttempt,Long>{

    List<QuizAttempt> findByUser(User user);
    
}
