package com.project1.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signup_details")
public class UserData {

	@Id
	private String mail;
	private String name;
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(String name, String mail, String pass) {
		super();
		this.name = name;
		this.mail = mail;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "SignupData [name=" + name + ", mail=" + mail + ", pass=" + pass + "]";
	}

}