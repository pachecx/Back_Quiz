package quiz.com.backquiz.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Resposta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String texto;
    
    private boolean correta;
    
    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Pergunta pergunta;
}
