package com.edstem.expensemanager.repository;

import com.edstem.expensemanager.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByDate(LocalDate date);
}
