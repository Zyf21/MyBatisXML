package com.example.entities;

import java.io.Serializable;

public class UserEntity implements Serializable {


    private Long id;
    private String userName;
    private String passWord;
    private String nickName;


    public UserEntity() {
        super();
    }

    public UserEntity(String userName, String passWord, String nickName) {
        this.userName = userName;
        this.passWord = passWord;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
