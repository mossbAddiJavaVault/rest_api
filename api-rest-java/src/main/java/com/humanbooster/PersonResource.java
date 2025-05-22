package com.humanbooster;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
    private final PersonDao dao = new PersonDao();

    @GET
    public List<Person> getAll() {
        return dao.findAll();
    }

    @GET
    @Path("/{id}")
    public Person getById(@PathParam("id") Long id) {
        return dao.findById(id);
    }

    @POST
    public void create(Person person) {
        dao.save(person);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id, Person person) {
        person.setId(id);
        dao.save(person);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        dao.delete(id);
    }
} 