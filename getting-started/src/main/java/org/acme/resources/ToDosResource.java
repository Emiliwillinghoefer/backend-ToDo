package org.acme.resources;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import org.acme.entity.ToDo;
import org.acme.services.ToDoService;

import java.util.List;



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
    public void addTodo(ToDo toDo) {
        service.adicionar(toDo);
        System.out.println("Rota para adicionar um to do");
    }


    @POST
    @Path("/update")
    public void updateTodo(ToDo toDo) {
        service.atualizar(toDo);
        System.out.println("Rota para editar um to do");
    }

    @POST
    @Path("/delete")
    public void deleteTodo(@PathParam("id") Long id) {
        service.deletar(id);
        System.out.println("Rota para deletar um to do");
    }

    @POST
    @Path("/deleteAll")
    public void deleteAllTodo() {
        service.deletarTodos();
        System.out.println("Rota para deletar todos os  to dos");
    }

    @GET
    @Path("/view")
    public List<ToDo> viewTodo() {

        System.out.println("Rota para ver todos os to dos");
        return service.listarTodos();

    }

}