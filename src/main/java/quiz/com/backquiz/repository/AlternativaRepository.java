package quiz.com.backquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quiz.com.backquiz.model.Alternativa;


public interface AlternativaRepository extends JpaRepository<Alternativa, Long> {
}