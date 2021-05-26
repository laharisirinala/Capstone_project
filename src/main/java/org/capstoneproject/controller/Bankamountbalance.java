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
public class Bankamountbalance {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/bankamountbalance/{cid}")
	public ModelAndView amountbalance(ModelAndView model, @PathVariable("cid") int cid)
			throws IOException {

		List<BankUser> dl =bankuserDao.balance(cid);
		model.addObject("kk", dl);
		model.setViewName("Bankamountbalance");

		return model;
	}
}
