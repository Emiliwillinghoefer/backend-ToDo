package org.acme.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ToDo {

    @Id
    private String id;

    @Column
    private String description;

    @Column
    private boolean active;

}
