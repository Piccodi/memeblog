package com.example.memblog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.IDENTITY;

//todo поля username и password не должны быть null
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String username;
    private String password;

    @OneToOne(mappedBy = "user")
    private FavMemEntity favMemes;

    public FavMemEntity getFavMemes() {return favMemes;}

    public void setFavMemes(FavMemEntity favMemes) {this.favMemes = favMemes;}

    public UserEntity(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


