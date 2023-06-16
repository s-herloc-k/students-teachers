package com.sherlock.laba4.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "predmet")
    private String predmet;

    public Teacher() {

    }

    public Teacher(String firstName, String lastName, String predmet) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.predmet = predmet;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPredmet() {
        return predmet;
    }
    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
