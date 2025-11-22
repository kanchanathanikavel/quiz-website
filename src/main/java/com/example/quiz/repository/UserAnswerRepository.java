package com.example.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quiz.entity.UserAnswer;

public interface UserAnswerRepository extends JpaRepository<UserAnswer,Long> {
    
}
