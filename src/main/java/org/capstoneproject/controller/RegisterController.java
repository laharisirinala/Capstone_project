package org.capstoneproject.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
@Controller
public class RegisterController {

		@Autowired
		private BankUserDao bankuserDao;

		@RequestMapping(value = "/userregister", method = RequestMethod.POST)
		public ModelAndView register(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("uname") String uname,@RequestParam("pass") String pass,@RequestParam("atype") String type,@RequestParam("gender") String gender,@RequestParam("phone") String phone,@RequestParam("address") String address,@RequestParam("anum") String anum,@RequestParam("dd") String dd, @RequestParam("email") String email,
				@RequestParam("country") String country, ModelAndView mv) {
            int bal=0;
			BankUser user = new BankUser();
			user.setFname(fname);
			user.setLname(lname);
			user.setUname(uname);
			user.setAddress(address);
			user.setDob(dd);
			user.setGender(gender);
			user.setEmail(email);
			user.setPassword(pass);
			user.setAdharno(anum);
			user.setMobno(phone);
			user.setCountry(country);
			user.setAccounttype(type);
			user.setBalance(bal);
			System.out.println("yes");
			Random r1 = new Random();
			int n1 = r1.nextInt(999999);
			String a1=Integer.toString(n1);

			Random r2 = new Random();
			int n2 = r2.nextInt(999999);
			String a2=Integer.toString(n2);
			String acnum=a1+a2;

			Random r3 = new Random();
			int n3 = r3.nextInt(999999);
			String a3=Integer.toString(n3);
			user.setAccountno(acnum);
		    user.setCustid(a3);
		    user.setStatus("unblock");
		    user.setWithdrawstatus("allow");
		    user.setDepositstatus("allow");
		    user.setTransferstatus("allow");
			int counter = bankuserDao.userregister(user);

           if (counter > 0)
            {
              mv.addObject("msg", "User Registered successfully.");
              mv.addObject("acnum", acnum);
              mv.addObject("cid", a3);
              mv.setViewName("Bankcarddetails");
            } 
           else {
             mv.addObject("msg", "Error- check the console log.");
             mv.setViewName("bankregister");
            }

             return mv;
		}
	}
