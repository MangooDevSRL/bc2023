package com.mangoodev.bootcamp2023.service;

import com.mangoodev.bootcamp2023.domain.Client;
import com.mangoodev.bootcamp2023.domain.Product;
import com.mangoodev.bootcamp2023.domain.Transaction;
import com.mangoodev.bootcamp2023.repository.ClientRepository;
import com.mangoodev.bootcamp2023.repository.ProductRepository;
import com.mangoodev.bootcamp2023.repository.TransactionRepository;
import com.mangoodev.bootcamp2023.service.dto.TransactionWithProductsDTO;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;

    private final ClientRepository clientRepository;

    private final ProductRepository productRepository;

    @Autowired
    public TransactionService(
        TransactionRepository transactionRepository,
        ClientRepository clientRepository,
        ProductRepository productRepository
    ) {
        this.transactionRepository = transactionRepository;
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
    }

    public Transaction findByDate(ZonedDateTime date) {
        return transactionRepository.findByDate(date);
    }

    public Transaction createTransaction(Transaction transaction) {
        Client client = clientRepository
            .findById(transaction.getClient().getId())
            .orElseThrow(() -> new EntityNotFoundException("Client not found with ID: " + transaction.getClient().getId()));

        Set<Product> productSet = transaction.getProducts();

        List<Product> productList = new ArrayList<>(productSet);

        transaction.setClient(client);

        transaction.getProducts().clear();
        transaction.getProducts().addAll(productList);

        return transactionRepository.save(transaction);
    }

    public TransactionWithProductsDTO getTransactionWithProducts(Long id) {
        Transaction transaction = transactionRepository
            .findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Transaction not found with ID: " + id));

        TransactionWithProductsDTO transactionDTO = new TransactionWithProductsDTO();
        transactionDTO.setId(transaction.getId());
        transactionDTO.setDate(transaction.getDate());
        transactionDTO.setProducts(transaction.getProducts());

        return transactionDTO;
    }
}
