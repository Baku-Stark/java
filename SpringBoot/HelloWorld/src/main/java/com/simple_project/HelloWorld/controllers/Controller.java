package com.simple_project.HelloWorld.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping
public class Controller {
    ArrayList<ArrayList<String>> users = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/get_users")
    public ArrayList<ArrayList<String>> getUsers() {
        return users;
    }

    @PostMapping("/post_user")
    public ArrayList<String> postUser(String username, String password) {
        ArrayList<String> user_set = new ArrayList<String>();

        user_set.add(username);
        user_set.add(password);

        users.add(user_set);

        return user_set;
    }

    @PutMapping("/update_user")
    public ArrayList<String> putUser(Integer id, String username, String password) {
        ArrayList<String> user_set = new ArrayList<String>();
        user_set.add(username);
        user_set.add(password);

        users.set(id - 1, user_set);

        return user_set;
    }

    @DeleteMapping("/delete_user")
    public ArrayList<String> deleteUser(Integer id) {
        ArrayList<String> user_set = new ArrayList<String>();
        user_set.add(String.valueOf(users.get(id - 1)));

        users.remove(id - 1);

        return user_set;
    }
}
