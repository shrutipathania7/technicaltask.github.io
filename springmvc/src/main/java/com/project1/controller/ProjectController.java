package com.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project1.dao.ProjectDao;

@Controller
public class ProjectController {

	@Autowired
	private ProjectDao dao;
	
	String forgotPasswordEmail = null;
	
	@GetMapping("/signup")
	public String signup() {
		return "signupform";
	}

	@PostMapping("/submitsignupform")
	public String submitSignupForm(@RequestParam("name") String name, @RequestParam("emailid") String mail,
			@RequestParam("password") String pass, Model model) {

		boolean result = dao.signup(mail, name, pass);
//		System.out.println(result);

		if (result == false) {
			model.addAttribute("message", "Data already exist...!!!");
			return "signupform";
		} else {

			return "signupcompleted";
		}

	}

	@GetMapping("/login")
	public String login() {
		return "loginform";
	}

	@PostMapping("/submitloginform")
	public String submitloginform(@RequestParam("username") String username, @RequestParam("password") String pass,
			Model model) {

		boolean result = dao.login(username, pass);
//		System.out.println(result);
		if (result == false) {
			model.addAttribute("message", "Invalid Credentials...!!!");
			return "loginform";
		} else {
			return "userhomepage";
		}

	}

	@GetMapping("/forgotpassword")
	public String forgotpassword() {
		return "forgotpasswordform";
	}

	@PostMapping("/submitforgotpassword")
	public String submitforgotpassword(@RequestParam("name") String name, @RequestParam("email") String mail, Model model) {
		boolean result = dao.verifyUser(name, mail);
		forgotPasswordEmail = mail;
		if (result == false) {
			model.addAttribute("message", "Invalid Details");
			return "forgotpasswordform";
		} else {
			model.addAttribute("status", "Valid Details");
			return "forgotpasswordform";
		}

	}
	@PostMapping("/submitnewpassword")
	public String changePassword(@RequestParam("newpass") String newpass,Model model) {
		boolean result = dao.updatePassword(forgotPasswordEmail, newpass);
	
		if (result==false) {
			model.addAttribute("message", "Something Went Wrong..!!");
			return "forgotpasswordform";
		} else {
			model.addAttribute("message", "Password updated successfully..");
			return "loginform";
		}
	
	}

}
