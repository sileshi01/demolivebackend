package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-16
 * Time: 12:45
 * Project:demolivebackend
 * Copyright: MIT
 */
@Entity
public class Kompis {
  @Id
  @GeneratedValue
    private long id;

    private String name;
    private String address;
    private String telefonNumber;

    public Kompis(){}

    public Kompis(long id, String name, String address, String telefonNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telefonNumber = telefonNumber;
    }

    @Override
    public String toString() {
        return "Kompis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }
}
