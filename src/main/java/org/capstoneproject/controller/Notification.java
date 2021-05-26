package org.capstoneproject.controller;

import java.io.IOException;
import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Checkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Notification {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/notification/{cid}")
	public ModelAndView notify(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
		String a="";
		List<Checkbook> dl =bankuserDao.notification(cid);
		for (Checkbook x:dl)
		{
			a=x.getStatus();	
		}
		//System.out.println(a.equals("grant"));
		if(dl.isEmpty())
		{
			model.addObject("msg","No Notifications");
			model.setViewName("display");
		}
		else
		{
		if(a.equals("grant"))
		{
			int c=bankuserDao.checkbookdel(cid);
			model.addObject("msg","Checkbook Request Granted .. Your Checkbook will deliver soon ");
		    model.setViewName("display");		
		}else if(a.equals("requested"))
		{	
			model.addObject("msg","Checkbook Request Still pending");
			model.setViewName("display");
		}else if(a.equals("deny"))
		{	
			int c=bankuserDao.checkbookdel(cid);
			model.addObject("msg","Checkbook Request Denied");
			model.setViewName("display");
		}
		}	
			return model;
	
	}
}
