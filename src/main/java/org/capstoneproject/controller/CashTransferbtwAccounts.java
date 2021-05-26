package org.capstoneproject.controller;

import java.util.List;
import java.util.Random;
import java.io.IOException;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;  
import java.util.Calendar;

import org.capstoneproject.dao.BankUserDao;
import org.capstoneproject.dao.TransactionDao;
import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CashTransferbtwAccounts {
	@Autowired
	private BankUserDao bankuserDao;

	@RequestMapping(value = "/checktransferbtwacc/transfer/{cid}/val/{name}/{accid}/{acctype}/{mobno}", method = RequestMethod.POST)
	public ModelAndView cashtransfer(ModelAndView model,@PathVariable("cid") int scid,@PathVariable("name") String rname,@PathVariable("accid") String accid,@PathVariable("acctype") String acctype,@PathVariable("mobno") String mobno,@RequestParam("amount") int amount,@RequestParam("pass") String password)
			throws IOException {
		int bal=0,b2=0,kl=0,rbal=0,b=0;
		String a="",n="";
		String suname="";String taccno="";String rcid="";
		System.out.println(rname);
		
		 LocalDate t=LocalDate.now();
         DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
         LocalDateTime now=LocalDateTime.now();
         String time=dtf.format(now);
      
		BankUser user = new BankUser();
		List<BankUser> lt= bankuserDao.getdetails(scid);    
		for (BankUser x:lt)
		{
			a=x.getAccountno();
			b=x.getBalance();
			suname = x.getUname();
			n=x.getCustid();

		}
		user.setUname(a);
		user.setPassword(password);
		List<BankUser> dl = bankuserDao.getbal(a);
		List<BankUser> d4 = bankuserDao.getbal(accid);

		for (BankUser x:dl)
		{
			bal=x.getBalance();
			
		}
		Random r1 = new Random();
		int t1 = r1.nextInt(999999);
		
		if(bal>=amount)
		{
		int y=bal-amount;
		user.setBalance(y);
		
		int counter = bankuserDao.balwithdraw(a,password,y);    
		System.out.println(d4);

		for (BankUser x:d4)
		{
			System.out.println(x.getBalance());

			b2=x.getBalance();
			rcid=x.getCustid();
			
		}
		rbal=b2+amount;

		int j=bankuserDao.deposit(accid,rbal);
		
		Transaction trans =new Transaction();
		trans.setTid(t1);
		trans.setAccid(accid);
		trans.setAmount(amount);
		trans.setToperson(rname);
		trans.setFromperson("----");
		trans.setDate(t.toString());
		trans.setTime(time);
		trans.setBalance(y);
	    trans.setCid(n);
	    trans.setType("Transfer");
		Random r2 = new Random();
		int n2 = r2.nextInt(999999);
		Transaction t2 =new Transaction();
		t2.setTid(n2);
		t2.setAmount(amount);
		t2.setFromperson(suname);
		t2.setToperson("----");
		t2.setDate(t.toString());
		t2.setTime(time);
		t2.setAccid(a);
		t2.setCid(rcid);
		t2.setType("Deposit");
		List<BankUser> dl2 = bankuserDao.getdetailsaccid(accid);
		System.out.println("t1     "+    accid);
		System.out.println(dl2);
	
		System.out.println(rbal);
		t2.setBalance(b2+amount);
		t2.setCid(rcid);
		if (counter> 0) {
			int value = bankuserDao.inserttrans(trans);   
			int l=bankuserDao.inserttrans(t2);

			if(value>0 && l>0)
			{
				model.addObject("msg", "Amount Transferes successful.");
				model.setViewName("display");
			}
		} else {
			model.addObject("msg", "Some Error in Amount Transfer.. Transaction Unsuccessful");
			model.setViewName("display");
	}
	}
		return model;
	}	
}
