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
public class RegisterRecipient {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checktransferbtwacc/addrecipient/registerrecipient/{cid}", method = RequestMethod.POST)
	public ModelAndView registerrecipient(@PathVariable("cid") String cid,@RequestParam("rname") String rname,@RequestParam("raid") String raid,@RequestParam("mobno") String mobno,@RequestParam("atype") String atype, ModelAndView model) {
		
		Recipient r=new Recipient();
		r.setAccid(raid);
		r.setAcctype(atype);
		r.setName(rname);
		r.setMobno(mobno);
		r.setScid(cid);
		
		int s = bankuserDao.insertrecipient(r);
		if(s>0) {
			model.setViewName("cashtransferform");
		}
	else
	{
		model.addObject("msg", "oopps");
		model.setViewName("trasac");
	}	
	System.out.println("yes");
	return model;

}
}
