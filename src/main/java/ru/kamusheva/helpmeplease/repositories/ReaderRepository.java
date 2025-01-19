package ru.kamusheva.helpmeplease.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kamusheva.helpmeplease.entities.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Integer> {
}