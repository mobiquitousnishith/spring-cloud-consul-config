package com.nishith.spring.cloud.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishith.spring.cloud.models.Author;
import com.nishith.spring.cloud.services.AuthorService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Author> getAuthorDetails() {
        return ResponseEntity.ok(authorService.getAuthorDetails());
    }
}
