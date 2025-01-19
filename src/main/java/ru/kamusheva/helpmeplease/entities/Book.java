package ru.kamusheva.helpmeplease.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
    private Integer authorid;
    private String title;
    private Integer genreid;
}