package com.bonavadeur.demosprboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value={"/hello", "hello-world"}, method= RequestMethod.GET)
    public ResponseEntity<?> hello() {
        User user = new User(2, "two");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
