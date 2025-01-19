package ru.kamusheva.helpmeplease.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kamusheva.helpmeplease.entities.Author;
import org.springframework.stereotype.Repository;
import ru.kamusheva.helpmeplease.entities.*;

import java.util.List;

@Repository

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}