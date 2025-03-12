package quiz.com.backquiz.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import quiz.com.backquiz.model.Alternativa;
import quiz.com.backquiz.repository.AlternativaRepository;

import java.util.List;

@RestController
@RequestMapping("/alternativas")
public class AlternativaController {
    @Autowired
    private AlternativaRepository alternativaRepository;

    @GetMapping
    public List<Alternativa> listarAlternativas() {
        return alternativaRepository.findAll();
    }

    @PostMapping
    public Alternativa criarAlternativa(@RequestBody Alternativa alternativa) {
        return alternativaRepository.save(alternativa);
    }

    @GetMapping("/{id}")
    public Alternativa buscarAlternativa(@PathVariable Long id) {
        return alternativaRepository.findById(id).orElse(null);
    }
}
