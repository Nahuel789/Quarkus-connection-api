package org.acme.rest.resource;

import org.acme.rest.model.Country;
import org.acme.rest.service.Service;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/country")
public class CountriesResource {

    @Inject
    Service service;

    @GET
    @Path("/name/{name}")
    public Set<Country> name(@PathParam String name) {
        return service.getName(name);
    }
}
