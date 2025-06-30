package org.acme.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import org.acme.services.ToDoService;


@Path("/hello")
public class ToDosResource {

    @Inject
    ToDoService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @POST
    @Path("/add")
    public String addTodo() {

        System.out.println("Rota para adicionar um to do");
    }


    @POST
    @Path("/update")
    public String updateTodo() {
        System.out.println("Rota para editar um to do");
    }

    @POST
    @Path("/delete")
    public String deleteTodo() {
        System.out.println("Rota para deletar um to do");
    }

    @POST
    @Path("/deleteAll")
    public String deleteAllTodo() {
        System.out.println("Rota para deletar todos os  to dos");
    }

    @GET
    @Path("/view")
    public String viewTodo() {
        System.out.println("Rota para ver todos os to dos");
    }

}