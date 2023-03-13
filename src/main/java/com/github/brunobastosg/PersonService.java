package com.github.brunobastosg;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository personRepository;

    @RestClient
    PersonRoleRestClient personRoleRestClient;

    public List<Person> findAll() {
        return personRepository.findAll().list();
    }

    public List<PersonRole> findAllRoles() {
        return personRoleRestClient.findAll();
    }
}
