package org.capstoneproject.controller;

import java.io.IOException;
import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.Checkbook;
import org.capstoneproject.model.Recipient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Checktransferbtwacc {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checktransferbtwacc/{cid}")
	public ModelAndView checktransfer(ModelAndView model, @PathVariable("cid") String cid)
			throws IOException {
		String a="allow";
		int s = bankuserDao.checkStatustransferbtwacc(cid,a);
		List<Recipient> rr=bankuserDao.retrieverecipient(cid);
		if(s>0) {
			model.addObject("a", rr);
			model.setViewName("cashtransferform");
		}
	else
	{
		model.addObject("msg", "Cash Transfer access of this account is currently blocked  ...");
		model.setViewName("display");
	}
		return model;
	}
}
