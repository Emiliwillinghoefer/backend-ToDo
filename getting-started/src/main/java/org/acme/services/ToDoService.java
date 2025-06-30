package org.acme.services;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.ToDo;
import org.acme.repository.ToDoRepository;

import java.util.List;

@ApplicationScoped
public class ToDoService {

    @Inject
    ToDoRepository repository;

    public void adicionar(ToDo toDo) {
        repository.persist(toDo);
    }

    public List<ToDo> listarTodos() {
        return repository.listAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public void deletarTodos() {
        repository.deleteAll();
    }

    public void atualizar(ToDo toDo) {
        repository.getEntityManager().merge(toDo);
    }

}

