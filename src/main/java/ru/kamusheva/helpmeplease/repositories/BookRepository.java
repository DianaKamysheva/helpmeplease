package ru.kamusheva.helpmeplease.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kamusheva.helpmeplease.entities.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}