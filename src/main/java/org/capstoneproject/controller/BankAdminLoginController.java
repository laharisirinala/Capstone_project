package org.capstoneproject.controller;

import org.capstoneproject.dao.BankAdminDao;
import org.capstoneproject.model.BankAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankAdminLoginController {
	
	
		@Autowired
		private BankAdminDao a;

		@RequestMapping(value = "/Bankadminlogin", method = RequestMethod.POST)
		public ModelAndView adminlogin(@RequestParam("aname") String aname,@RequestParam("pass") String pass, ModelAndView mv) {

			BankAdmin admin = new BankAdmin();
			admin.setAname(aname);
			admin.setPassword(pass);
			int counter = a.alogin(aname,pass);

			if (counter> 0) {
				mv.addObject("msg", "Login registration successful.");
				mv.setViewName("bankadminmenu");
			} else {
				mv.addObject("msg", "Invalid Admin Login Credentials");
				mv.setViewName("addisplay");
			}

		

			return mv;
		}
	}

