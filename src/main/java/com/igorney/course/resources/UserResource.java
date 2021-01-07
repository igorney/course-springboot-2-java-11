package com.igorney.course.resources;

import com.igorney.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User igor = new User(1L, "Igor", "Email", "999","senha");
        return ResponseEntity.ok().body(igor);
    }
}
