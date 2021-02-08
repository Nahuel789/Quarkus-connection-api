package org.acme.rest.service;

import org.acme.rest.client.Client;
import org.acme.rest.model.Country;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Set;

@ApplicationScoped
public class Service {

    @Inject
    @RestClient
    Client client;

    public Set<Country> getName(String name){
        return client.getByName(name);
    }

}
