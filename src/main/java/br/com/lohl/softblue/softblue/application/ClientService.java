package br.com.lohl.softblue.softblue.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lohl.softblue.softblue.domain.client.Client;
import br.com.lohl.softblue.softblue.domain.client.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void saveClient(Client client) {
        clientRepository.save(client);
    }
}
