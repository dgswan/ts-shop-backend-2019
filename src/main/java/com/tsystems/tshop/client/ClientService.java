package com.tsystems.tshop.client;

import java.util.Set;

public interface ClientService {

    Set<Client> getClients(String nameFilter);

}
