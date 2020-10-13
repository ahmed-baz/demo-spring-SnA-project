package com.example.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "users"
        , catalog = "demo"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Long id;
    @Column(name = "user_name",unique = true)
    String UserName;

    public User() {
    }

    String password;

    public User(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User(Long id, String userName, String password, String code) {
        this.id = id;
        UserName = userName;
        this.password = password;
        this.code = code;
    }
    String code;
}
