package ru.kamusheva.helpmeplease.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer readerid;
    private String name;
    private String surname;
}