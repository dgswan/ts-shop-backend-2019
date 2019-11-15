package com.tsystems.tshop.client;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

     @Transactional(readOnly = true)
    @Override
    public Set<Client> getClients(String nameFilter) {
        return clientRepository.getClients(nameFilter);
    }
}
