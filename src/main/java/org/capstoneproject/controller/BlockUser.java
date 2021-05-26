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
public class BlockUser {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/block/{cid}")
	public ModelAndView blockuser(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
		String a="block";
		int counter =bankuserDao.block(cid,a);
		if(counter>0)
		{
			model.addObject("msg","User blocked Successfully");
			model.setViewName("addisplay");
		}
		else
		{
		model.setViewName("Bankamountbalance");
		}
		return model;
	}
}
