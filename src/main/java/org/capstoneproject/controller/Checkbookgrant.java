package org.capstoneproject.controller;

import java.io.IOException;

import org.capstoneproject.dao.BankUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Checkbookgrant {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checkbookgrant/{cid}")
	public ModelAndView checkbookGrant(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
		String a="grant";
		int counter =bankuserDao.checkbookgrant(cid,a);
		if(counter>0)
		{
			model.addObject("msg","Checkbook Request Granted");
			model.setViewName("addisplay");
		}
		else
		{
		model.setViewName("bankadminmenu");
		}
		return model;
	}
}
