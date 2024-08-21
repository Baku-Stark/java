package com.spring.railway_mysql.controllers;

import com.spring.railway_mysql.repository.UserRepository;
import com.spring.railway_mysql.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/get_user/{id}")
    public Optional<User> readOneUser(@PathVariable("id") Long id){
        System.out.println("User ID: " + id);
        return userRepository.findById(id);
    }


    /**
     * <h1>CREATE</h1>
     * <p>
     * Criar um novo usuário.
     * </p>
     *
     * @return ResponseEntity
     */
    @PostMapping("/create_user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        //userRepository.save(user);
        System.out.printf("{name: %s, email: %s}", user.getName(), user.getEmail());
        if(!user.getName().isEmpty() && !user.getEmail().isEmpty()){
            userRepository.save(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
    }

    /**
     * <h1>DELETE</h1>
     * Deleter um usuário
     * 
     * @return ResponseEntity
     */
    @DeleteMapping("/delete_user/{id}")
    public ResponseEntity<Optional<User>> deleteUser(@PathVariable("id") Long id){
        Optional<User> userDeleted = userRepository.findById(id);

        userRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDeleted);
    }

    /**
     * <h1>UPDATE</h1>
     * 
     * @return ResponseEntity
     */
    @PutMapping("/update_user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user){
        Optional<User> userUpdated = userRepository.findById(id);

        if (userUpdated.isPresent()) {
            User existingUser = userUpdated.get();
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());

            return ResponseEntity.ok(userRepository.save(existingUser));
        }
        
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
