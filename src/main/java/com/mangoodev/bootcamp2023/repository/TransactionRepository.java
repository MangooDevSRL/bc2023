package com.mangoodev.bootcamp2023.repository;

import com.mangoodev.bootcamp2023.domain.Transaction;
import com.mangoodev.bootcamp2023.service.dto.TransactionDTO;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Transaction entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("SELECT t FROM Transaction t WHERE DATE(t.day) =:date")
    List<Transaction> findDayTransactions(@Param("date") LocalDate date);
}
