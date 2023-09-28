package com.mangoodev.bootcamp2023.repository;

import com.mangoodev.bootcamp2023.domain.Client;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Client entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Transaction t JOIN t.client c GROUP BY c.id ORDER BY COUNT(t.id) DESC")
    List<Client> findTop3ByOrderByTransactionsDesc(Pageable pageable);
}
