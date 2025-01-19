package ru.kamusheva.helpmeplease.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loanid;
    private Integer bookid;
    private Integer readerid;
    private Date loandate;
    private Date returnedate;
}