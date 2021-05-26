package org.capstoneproject.controller;

import java.util.List;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.Recipient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClickTransfer {
	@Autowired
	private BankUserDao b2;

	@RequestMapping(value = "/checktransferbtwacc/transfer/{cid}/{accid}", method = RequestMethod.GET)
	public ModelAndView transfer(@PathVariable("cid") String cid,@PathVariable("accid") String raccid,ModelAndView model) {
		
		List<Recipient> dl =b2.retrieverecipientparticular(cid,raccid);
		model.addObject("kk",dl);
		model.addObject("scid",cid);
		model.setViewName("trasac");
		return model;

	}
}
