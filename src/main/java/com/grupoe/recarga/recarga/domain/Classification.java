package com.grupoe.recarga.recarga.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import  java.util.Objects;

@Entity
public class Classification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;
    private String description;

    public Classification(){

    }

    public Classification(final long id, final String type, final String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public long getId(){return id;}

    public Classification setid(final long id) {
        this.id = id;
        return this;
    }

    public String getType() {return type;}

    public Classification settype(final String type){
        this.type = type;
        return this;
    }

    public String getDescription(){return description;}

    public Classification setDescription(final String description){
        this.description = description;
        return this;
    }


    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Classification classification = (Classification) o;
        return id == classification.id &&
                Objects.equals(type, classification.type) &&
                Objects.equals(description, classification.description);
    }

    //@Override
    //public int hasCode() { return Objects.hash(id, type, description);}

    @Override
    public String toString(){
        return "Classification{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description'" + description + '\'' +
                '}';
    }
}

