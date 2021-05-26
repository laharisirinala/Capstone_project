package org.capstoneproject.controller;

import java.io.IOException;
import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Checkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admingetcheckbook {
	@Autowired
	private BankUserDao bankuserdao;

	@RequestMapping(value = "/admingetcheckbook")
	public ModelAndView getcheckbook(ModelAndView model) throws IOException {

		List<Checkbook> dl =bankuserdao.checkbookdetails();
		model.addObject("ll", dl);
		model.setViewName("detailsofrqcheckbook");

		return model;
	}
}
