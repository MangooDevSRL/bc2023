package com.mangoodev.bootcamp2023.repository;

import com.mangoodev.bootcamp2023.domain.Transaction;
import com.mangoodev.bootcamp2023.service.dto.TransactionDTO;
import java.time.ZonedDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Transaction entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("select t from Transaction t where DATE_TRUNC('day', day) = '2023-09-27'")
    List<Transaction> findDayTransactions();
}
