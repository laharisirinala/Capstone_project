package org.capstoneproject.controller;

import java.io.IOException;

import org.capstoneproject.dao.BankUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Cashwithdrawallow {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/cashwithdrawallow/{cid}")
	public ModelAndView withdrawallow(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
		String a="allow";
		int counter =bankuserDao.withdrawallow(cid,a);
		if(counter>0)
		{
			model.addObject("msg","withdraw access Granted to user");
			model.setViewName("addisplay");
		}
		else
		{
		model.setViewName("Bankamountbalance");
		}
		return model;
	}
}
