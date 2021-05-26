package org.capstoneproject.controller;

import java.io.IOException;

import org.capstoneproject.dao.BankUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Checkbookdeny {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checkbookdeny/{cid}")
	public ModelAndView checkbookDeny(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
		String a="deny";
		int counter =bankuserDao.checkbookdeny(cid,a);
		if(counter>0)
		{
			model.addObject("msg","Checkbook Request Denied");
			model.setViewName("addisplay");
		}
		else
		{
		model.setViewName("bankadminmenu");
		}
		return model;
	}
}
