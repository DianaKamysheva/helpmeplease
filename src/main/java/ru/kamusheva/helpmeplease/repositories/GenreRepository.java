package ru.kamusheva.helpmeplease.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kamusheva.helpmeplease.entities.Genre;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}