package com.cfs.mysqlsecurity.DB;


import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String NameOfRole;

    public String getNameOfRole() {
        return NameOfRole;
    }

    public void setNameOfRole(String nameOfRole) {
        NameOfRole = nameOfRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
