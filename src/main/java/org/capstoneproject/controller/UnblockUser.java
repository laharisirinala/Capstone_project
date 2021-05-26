package org.capstoneproject.controller;

import java.io.IOException;

import org.capstoneproject.dao.BankUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnblockUser {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/unblock/{cid}")
	public ModelAndView unblock(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
		String a="unblock";
		int counter =bankuserDao.unblock(cid,a);
		if(counter>0)
		{
			model.addObject("msg","User Unblocked Successfully");
			model.setViewName("addisplay");
		}
		else
		{
			model.setViewName("Bankamountbalance");
		}
		return model;
	}
}
