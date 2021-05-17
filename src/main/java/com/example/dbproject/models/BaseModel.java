package com.example.dbproject.models;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public class BaseModel<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
