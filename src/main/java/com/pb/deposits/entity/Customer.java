package com.pb.deposits.entity;

import com.pb.deposits.entity.validators.Email;
import com.pb.deposits.entity.validators.Name;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @Email
    private String email;

    @Name
    private String name;

    public Customer() {
    }

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
