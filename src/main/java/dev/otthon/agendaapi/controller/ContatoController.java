package dev.otthon.agendaapi.controller;

import dev.otthon.agendaapi.model.entity.Contato;
import dev.otthon.agendaapi.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository repository;;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contato save(@RequestBody Contato contato) {
        return repository.save(contato);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping
    public List<Contato> list() {
        return repository.findAll();
    }

    @PatchMapping("{id}/favorito")
    public void favorite(@PathVariable Integer id, @RequestBody Boolean favorito) {
        Optional<Contato> contato = repository.findById(id);
        contato.ifPresent(c -> {
            c.setFavorito(favorito);
            repository.save(c);
        });
    }

}
