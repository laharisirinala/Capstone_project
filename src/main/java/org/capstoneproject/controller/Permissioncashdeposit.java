package org.capstoneproject.controller;

import java.io.IOException;
import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Permissioncashdeposit {
	@Autowired
	private BankUserDao bankuserdao;

	@RequestMapping(value = "/permissioncashdeposit")
	public ModelAndView permitcashdeposit(ModelAndView model) throws IOException {

		List<BankUser> dl =bankuserdao.user();
		model.addObject("ll", dl);
		model.setViewName("adminusercashdepositlist");

		return model;
	}
}
