package br.com.devlucassilva.workshop.resources;

import br.com.devlucassilva.workshop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@email.com", "(99)99999-9999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
