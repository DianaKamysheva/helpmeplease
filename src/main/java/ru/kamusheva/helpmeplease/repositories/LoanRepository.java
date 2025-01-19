package ru.kamusheva.helpmeplease.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kamusheva.helpmeplease.entities.Loan;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}