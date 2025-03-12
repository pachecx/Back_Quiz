package quiz.com.backquiz.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import quiz.com.backquiz.model.Quiz;


public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
