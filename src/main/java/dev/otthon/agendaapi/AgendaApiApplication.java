package dev.otthon.agendaapi;

import dev.otthon.agendaapi.model.entity.Contato;
import dev.otthon.agendaapi.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {

//    @Bean
//    public CommandLineRunner commandLineRunner(@Autowired ContatoRepository contatoRepository) {
//        return args -> {
//            Contato contato = new Contato();
//            contato.setNome("Otthon");
//            contato.setEmail("otthon@email.com");
//            contato.setFavorito(false);
//            contatoRepository.save(contato);
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(AgendaApiApplication.class, args);
    }

}
