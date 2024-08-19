package com.spring.railway_mysql.controllers;

import com.spring.railway_mysql.repository.UserRepository;
import com.spring.railway_mysql.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * <h1>HOME - INDEX</h1>
     * @return "Hello World"
     */
    @GetMapping
    public String index() {
        return "Hello World";
    }

    /**
     * <h1>READ</h1>
     * <p>
     * Ler conteúdo do banco de dados
     * </p>
     */
    @GetMapping("/read_users")
    public List<User> readUsers() {
        return userRepository.findAll();
    }


    /**
     * <h1>CREATE</h1>
     * <p>
     * Criar um novo usuário.
     * </p>
     *
     * @return ResponseEntity
     */
    @PostMapping(value = "/create_user", name = "Criar um novo usuário")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        //userRepository.save(user);
        System.out.printf("{name: %s, email: %s}", user.getName(), user.getEmail());
        if(!user.getName().isEmpty() && !user.getEmail().isEmpty()){
            userRepository.save(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
    }
}
