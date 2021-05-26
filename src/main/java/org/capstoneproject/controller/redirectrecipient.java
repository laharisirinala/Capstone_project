package org.capstoneproject.controller;

import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Recipient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class redirectrecipient {

	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checktransferbtwacc/addrecipient/{cid}", method = RequestMethod.GET)
	public ModelAndView rr(@PathVariable("cid") int cid,ModelAndView model) {
		
		model.addObject("scid",cid);
		model.setViewName("addrec");
		return model;
	}
		
}