package com.tsystems.tshop.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/api")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/clients")
    public Set<Client> getClients(@RequestParam(name = "nameFilter", required = false)
            String nameFilter) {
        return clientService.getClients(nameFilter);
    }

}
