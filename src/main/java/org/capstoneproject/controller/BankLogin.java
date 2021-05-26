package org.capstoneproject.controller;

import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class BankLogin {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/banklogin", method = RequestMethod.POST)
	public ModelAndView checklogin(@RequestParam("cid") String cid,@RequestParam("pass") String pass, ModelAndView mv) {

		BankUser user = new BankUser();
		user.setCustid(cid);
		user.setPassword(pass);
		String a="unblock";
		int s = bankuserDao.checkStatus(cid,a);
		System.out.println(s);
		if(s>0)
		{
		int counter = bankuserDao.checklogin(cid,pass);
		if (counter> 0) {
			mv.addObject("msg", "Login registration successful.");
			mv.addObject("cid",cid);
			mv.setViewName("BankMenu");
		} else {
			mv.addObject("msg", "Invalid login Credentails");
			mv.setViewName("BankLogin");
		}
	}
		else	
		{
			mv.addObject("msg", "Account is blocked");
			mv.setViewName("BankLogin");
		}
		return mv;

	}
}
