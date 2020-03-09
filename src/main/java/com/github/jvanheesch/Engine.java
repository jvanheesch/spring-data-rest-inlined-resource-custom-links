package com.github.jvanheesch;

import javax.persistence.*;

@Entity
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    private EnginePart enginePart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnginePart getEnginePart() {
        return enginePart;
    }

    public void setEnginePart(EnginePart enginePart) {
        this.enginePart = enginePart;
    }
}
