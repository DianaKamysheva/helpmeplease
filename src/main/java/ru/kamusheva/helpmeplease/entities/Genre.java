package ru.kamusheva.helpmeplease.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genreid;
    private String genrename;
}