package com.project1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.project1.bean.UserData;

@Repository
public class ProjectDao {

	public boolean signup(String email, String name, String password) {
		UserData user = new UserData(name, email, password);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean login(String mail, String pass) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager manager = factory.createEntityManager();

		UserData u1 = manager.find(UserData.class, mail);
		if (u1!=null && u1.getPass().equals(pass)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyUser(String name, String mail) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager manager = factory.createEntityManager();

		try {
			UserData user = manager.find(UserData.class,mail);
			if (user!=null && user.getName().equalsIgnoreCase(name)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updatePassword(String mail,String password) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		UserData user = manager.find(UserData.class,mail);
		user.setPass(password);
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

