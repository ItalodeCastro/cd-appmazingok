package com.campusdual.appmazing.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String surname_1;
    @Column
    private String surname_2;
    @Column
    private String email;
    @Column
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname_1() {
        return surname_1;
    }

    public void setSurname_1(String surname1) {
        this.surname_1 = surname1;
    }

    public String getSurname_2() {
        return surname_2;
    }

    public void setSurname_2(String surname2) {
        this.surname_2 = surname2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}