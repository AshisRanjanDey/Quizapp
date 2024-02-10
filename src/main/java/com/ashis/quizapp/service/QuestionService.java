package com.ashis.quizapp.service;

import com.ashis.quizapp.dao.QuestionDao;
import com.ashis.quizapp.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}
