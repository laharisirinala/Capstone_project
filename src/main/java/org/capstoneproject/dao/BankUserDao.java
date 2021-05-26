package org.capstoneproject.dao;

import java.util.List;

import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Checkbook;
import org.capstoneproject.model.Recipient;
import org.capstoneproject.model.Transaction;

public interface BankUserDao {

	public  int userregister(BankUser user);

	public int checklogin(String cid, String pass);

	public List<BankUser> balance(int cid);

	public List<BankUser>  getbal(String aid);

	public int balwithdraw(String aid, String pass, int y);

	public int deposit(String aid, int y);

	public int inserttrans(Transaction trans);

	public List<Transaction> transactionhistory(int cid);

	public int checkStatus(String cid, String a);

	public List<BankUser> getdetails(int cid);

	public int requestcheckbookinsertion(String uname, String address, String mobno, String accounttype, String acno,
			String custid, String a);

	public List<BankUser> user();

	public int block(int cid, String a);

	public int unblock(int cid, String a);

	public int withdrawallow(int cid, String a);

	public int withdrawdeny(int cid, String a);

	public int depositdeny(int cid, String a);

	public int depositallow(int cid, String a);

	public int tbtwaccallow(int cid, String a);

	public int tbtwaccdeny(int cid, String a);

	public int checkStatuswd(String cid, String a);

	public int checkStatusdeposit(String cid, String a);

	public int checkStatustransferbtwacc(String cid, String a);

	public List<Checkbook> checkbookdetails();

	public int checkbookgrant(int cid, String a);

	public int checkbookdeny(int cid, String a);

	public List<Checkbook> notification(int cid);

	public int checkbookdel(int cid);

	public List<Recipient> retrieverecipient(String cid);

	public int insertrecipient(Recipient r);

	public List<Recipient> retrieverecipientparticular(String cid, String raccid);

	public List<BankUser> getdetailsaccid(String accid);

	public int depositss(String aid, int y, String pass);


}
