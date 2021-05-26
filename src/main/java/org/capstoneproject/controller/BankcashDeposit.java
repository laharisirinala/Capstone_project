package org.capstoneproject.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class BankcashDeposit {
		@Autowired
		private BankUserDao bankuserDao;

		@RequestMapping(value = "/checkdeposit/bankdeposit", method = RequestMethod.POST)
		public ModelAndView cashdeposit(@RequestParam("aid") String aid,@RequestParam("pass") String pass,@RequestParam("amount") int amount, ModelAndView mv) {
			int bal=0;
			String cid=null,atype=null;
			 Date date = Calendar.getInstance().getTime();  
			 LocalDate t=LocalDate.now(); 	
	         DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
	         LocalDateTime now=LocalDateTime.now();
	         String time=dtf.format(now);
			BankUser user = new BankUser();
			user.setUname(aid);
			user.setPassword(pass);
			List<BankUser> dl = bankuserDao.getbal(aid);
			for (BankUser x:dl)
			{
				bal=x.getBalance();
				cid=x.getCustid();
				atype=x.getAccounttype();
			}
			System.out.println(bal);

			int y=bal+amount;
			System.out.println(y);
			user.setBalance(y);
			int counter = bankuserDao.depositss(aid,y,pass);
			Random r1 = new Random();
			int n1 = r1.nextInt(999999);
			
			Transaction trans =new Transaction();
			trans.setTid(n1);
			trans.setAccid(aid);
			trans.setAmount(amount);
			trans.setToperson("Self");
			trans.setFromperson("Self");
			trans.setDate(t.toString());
			trans.setTime(time);
			trans.setCid(cid);
			trans.setType("Deposit");
			
			if (counter> 0) {
				mv.addObject("msg", "Amount Deposit successfully");
				List<BankUser> l = bankuserDao.getbal(aid);
				for (BankUser x:l)
				{
					bal=x.getBalance();
				}
				
				trans.setBalance(bal);
				int value = bankuserDao.inserttrans(trans);   
				mv.addObject("bal",amount);
				mv.setViewName("display");
			}
			else {
				mv.addObject("msg", "Error in depositing amount");
				mv.addObject("bal",amount);
				mv.setViewName("display");
			}
			return mv;
		}
}
