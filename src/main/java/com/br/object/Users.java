package com.br.object;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Users {
	private int id;
	private String username;
	private String nickname;
	private String email;
	private String password;
	private String type; //super users or normal users
	private ArrayList<String> favoritebooks;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@NotEmpty(message="Username can't be empty")
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
	
	@NotEmpty(message="Please enter password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<String> getFavoritebooks(){
		return favoritebooks;
	}
	
	public void setFavoritebooks(ArrayList<String> favoritebooks){
		this.favoritebooks = favoritebooks;
	}
}
