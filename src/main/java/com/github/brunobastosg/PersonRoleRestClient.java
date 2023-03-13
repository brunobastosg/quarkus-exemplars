package com.github.brunobastosg;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(configKey = "personRoleApi")
public interface PersonRoleRestClient {

    @GET
    @Path("/people/roles")
    List<PersonRole> findAll();
}
