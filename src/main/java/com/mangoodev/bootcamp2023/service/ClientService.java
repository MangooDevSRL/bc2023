package com.mangoodev.bootcamp2023.service;

import com.mangoodev.bootcamp2023.domain.Client;
import com.mangoodev.bootcamp2023.repository.ClientRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getTop3ClientsWithMostTransactions() {
        List<Object[]> results = clientRepository.findTop3ClientsWithMostTransactions();

        List<Client> topClients = new ArrayList<>();
        for (Object[] result : results) {
            Client client = (Client) result[0];
            Long transactionCount = (Long) result[1];
            client.setTransactionCount(transactionCount);
            topClients.add(client);
        }

        return topClients.size() > 3 ? topClients.subList(0, 3) : topClients;
    }
}
