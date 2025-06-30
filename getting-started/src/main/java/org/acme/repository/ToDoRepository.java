package org.acme.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.ToDo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class ToDoRepository implements PanacheRepository<ToDo> {
}