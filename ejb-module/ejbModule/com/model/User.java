package com.model;

import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "users")
@NamedQuery(name="User.findUserByEmail", query="select u from User u where u.email = :email")
public class User {

	 public static final String FIND_BY_EMAIL = "User.findUserByEmail";
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	 
	 @Column(unique = true)
	 private String nome;
	 private String senha;
	 private String email;
	 private String role;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	 	 
}
