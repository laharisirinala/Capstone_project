package org.capstoneproject.controller;

import java.io.IOException;
import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Transactionhistory {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/transhistory/{cid}")
	public ModelAndView transhis(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {
System.out.println(cid);
		List<Transaction> dl =bankuserDao.transactionhistory(cid);
		model.addObject("th", dl);
		model.setViewName("transhistory");
		return model;
	}
}
