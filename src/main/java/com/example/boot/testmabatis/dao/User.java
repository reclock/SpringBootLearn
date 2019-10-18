package com.example.boot.testmabatis.dao;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVrsionUID = 1L;
    @Setter @Getter private Long id;
    @Setter @Getter private String firstname;
    @Setter @Getter private String lastname;
    @Setter @Getter private String passwd;


    public User(){}

    public User(Long id,String firstname,String lastname,String passwd){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.passwd = passwd;
        return;
    }

    public static long getSerialVrsionUID(){
        return serialVrsionUID;
    }

}
