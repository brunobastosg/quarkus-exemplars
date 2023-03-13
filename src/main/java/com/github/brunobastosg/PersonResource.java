package com.github.brunobastosg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("/people")
public class PersonResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonResource.class);

    @Inject
    PersonService personService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonResponse> findAll() {
        LOGGER.info("Finding all people...");
        List<Person> usuarios = personService.findAll();

        LOGGER.info("Findind all roles...");
        List<PersonRole> cargosUsuarios = personService.findAllRoles();

        LOGGER.debug("Mapping each person to its role...");
        Map<Integer, String> mapPersonRoles = cargosUsuarios.stream().collect(Collectors.toMap(PersonRole::personId, PersonRole::role));

        return usuarios.stream().map(u -> new PersonResponse(u.getId(), u.getName(), u.getAge(), mapPersonRoles.get(u.getId()))).toList();
    }
}