package quiz.com.backquiz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Alternativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    private boolean correta; // Indica se a alternativa é correta

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    @JsonIgnore
     @JsonManagedReference 
    private Pergunta pergunta;
}
