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
public class CheckbookRequest {
	@Autowired
	private BankUserDao bankuserDao;
	@RequestMapping(value = "/request/checkbook/{accountno}/{uname}/{address}/{mobno}/{custid}/{accounttype}")
	public ModelAndView checkbookReq(@PathVariable("accountno") String acno,@PathVariable("uname") String uname,@PathVariable("address") String address,@PathVariable("mobno") String mobno,@PathVariable("custid") String custid
			,@PathVariable("accounttype") String accounttype, ModelAndView mv) throws IOException {
		BankUser user = new BankUser();
		user.setUname(uname);
		user.setAddress(address);
		user.setMobno(mobno);
		user.setAccounttype(accounttype);
		user.setAccountno(acno);
	    user.setCustid(custid);
	    String a="requested";
		int dl =bankuserDao.requestcheckbookinsertion(uname, address, mobno,accounttype, acno, custid,a);
		mv.addObject("msg","Checkbook Request Sent");
		mv.setViewName("display");

		return mv;
	}
}