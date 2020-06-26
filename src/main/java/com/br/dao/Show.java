package com.br.dao;

public class Show {
    private String email;
    private String username;
    private int id;
    private String upassword;
    private String nickname;

    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public String getUsername() {
    	return username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getNickname() {
    	return nickname;
    }
    public void setNickname(String nickname) {
    	this.nickname = nickname;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
