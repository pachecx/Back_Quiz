package quiz.com.backquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.com.backquiz.model.Pergunta;


public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
}
