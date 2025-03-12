package quiz.com.backquiz.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import quiz.com.backquiz.model.Pergunta;
import quiz.com.backquiz.repository.PerguntaRepository;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {
    @Autowired
    private PerguntaRepository perguntaRepository;

    @GetMapping
    public List<Pergunta> listarPerguntas() {
        return perguntaRepository.findAll();
    }

    @PostMapping
    public Pergunta criarPergunta(@RequestBody Pergunta pergunta) {
        return perguntaRepository.save(pergunta);
    }

    @GetMapping("/{id}")
    public Pergunta buscarPergunta(@PathVariable Long id) {
        return perguntaRepository.findById(id).orElse(null);
    }
}
