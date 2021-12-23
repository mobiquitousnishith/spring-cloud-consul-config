package com.nishith.spring.cloud.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {

    private static final long serialVersionUID = 5799838034948075196L;

    private String name;

    private String role;

    private String organisation;
}
