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
public class Request {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/request/{cid}")
	public ModelAndView req(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {

		List<BankUser> dl =bankuserDao.getdetails(cid);
		
		model.addObject("kk", dl);
		model.addObject("cid", cid);
		model.setViewName("checkbookrequest");

		return model;
	}
	@Autowired
	private BankUserDao b2;

	@RequestMapping(value = "/request/no")
	public ModelAndView req1(ModelAndView model)
			throws IOException {

		model.setViewName("BankMenu");

		return model;
	}
}
