package org.capstoneproject.controller;

import java.io.IOException;
import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Checkwithdrawal {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checkwithdrawal/{cid}")
	public ModelAndView withdrawcheck(ModelAndView model, @PathVariable("cid") String cid)
			throws IOException {
		String a="allow";
		int s = bankuserDao.checkStatuswd(cid,a);
		if(s>0) {
			model.setViewName("withdrawalform");
		}
	else
	{
		model.addObject("msg", "Cash Withdraw access of this account is currently blocked...");
		model.setViewName("display");
	}
		return model;
	}
}
