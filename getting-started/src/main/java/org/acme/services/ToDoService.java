package org.acme.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ToDoService {


    public String greeting(String name) {
        return "hello " + name;
    }
}
