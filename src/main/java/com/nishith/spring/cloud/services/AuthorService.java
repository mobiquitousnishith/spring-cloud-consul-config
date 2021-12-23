package com.nishith.spring.cloud.services;

import org.springframework.stereotype.Service;

import com.nishith.spring.cloud.configuration.AuthorConfig;
import com.nishith.spring.cloud.models.Author;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorConfig authorConfig;

    public Author getAuthorDetails() {
        return Author.builder()
                .name(authorConfig.getName())
                .role(authorConfig.getRole())
                .organisation(authorConfig.getOrganisation())
                .build();
    }
}
