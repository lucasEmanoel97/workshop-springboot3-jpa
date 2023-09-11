// configuracoes para rodar no perfil de teste

package br.com.devlucassilva.workshop.config;

import br.com.devlucassilva.workshop.entities.User;
import br.com.devlucassilva.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

    /* A interface funcional CommandLineRunner faz com que qualquer coisa que esteja
     * dentro do seu metodo run(String... args), seja executada assim que a aplicacao
     * e inicializada
     *
     * Esta classe de configuracao serve para fazer seeding no data base
     * */
}
