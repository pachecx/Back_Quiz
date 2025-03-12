package quiz.com.backquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.com.backquiz.model.Resposta;


public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}
