package quiz.com.backquiz.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import quiz.com.backquiz.model.Pergunta;
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
    if (quiz.getPerguntas() != null) {
        for (Pergunta pergunta : quiz.getPerguntas()) {
            pergunta.setQuiz(quiz); // Garante que a relação seja salva corretamente
        }
    }
    return quizRepository.save(quiz);
}

    @GetMapping("/{id}")
    public Quiz buscarQuiz(@PathVariable Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarQuiz(@PathVariable Long id) {
    if (quizRepository.existsById(id)) {
        quizRepository.deleteById(id);
        return ResponseEntity.ok("Quiz deletado com sucesso!");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Quiz não encontrado.");
    }
}

}
