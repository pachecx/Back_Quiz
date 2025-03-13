package quiz.com.backquiz.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Data

public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enunciado;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
     @JsonBackReference 
    private Quiz quiz;

    @OneToMany(mappedBy = "pergunta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     @JsonManagedReference
    private List<Alternativa> alternativas;
}
