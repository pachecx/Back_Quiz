package quiz.com.backquiz.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import quiz.com.backquiz.model.Quiz;
import quiz.com.backquiz.repository.QuizRepository;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    
    @Autowired
    private QuizRepository quizRepository;

    @GetMapping
    public List<Quiz> listarQuizzes() {
        return quizRepository.findAll();
    }

    @PostMapping
    public Quiz criarQuiz(@RequestBody Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @GetMapping("/{id}")
    public Quiz buscarQuiz(@PathVariable Long id) {
        return quizRepository.findById(id).orElse(null);
    }
}
