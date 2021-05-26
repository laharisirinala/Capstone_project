package org.capstoneproject.controller;

import java.io.IOException;

import org.capstoneproject.dao.BankUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Checkdeposit {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checkdeposit/{cid}")
	public ModelAndView checkdepo(ModelAndView model, @PathVariable("cid") String cid)
			throws IOException {
		String a="allow";
		int s = bankuserDao.checkStatusdeposit(cid,a);
		if(s>0) {
			model.setViewName("cashdepositform");
		}
	else
	{
		model.addObject("msg", "Cash Deposit access of this account is currently blocked ...");
		model.setViewName("display");
	}
		return model;
	}
}
