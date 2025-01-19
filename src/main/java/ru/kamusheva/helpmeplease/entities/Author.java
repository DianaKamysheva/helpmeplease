package ru.kamusheva.helpmeplease.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorid;
    private String name;
    private String surname;
}
