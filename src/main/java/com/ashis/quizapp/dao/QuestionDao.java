package com.ashis.quizapp.dao;


import com.ashis.quizapp.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
