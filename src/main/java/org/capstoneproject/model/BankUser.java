package org.capstoneproject.model;

public class BankUser {
	private String fname;
	private String lname;
	private String uname;
	private String password;
	private String accounttype;
	private String mobno;
	private String gender;
	private String dob;
	private String adharno;
	private String address;
	private String email;
	private String country;
	private String accountno;
	private String custid;
	private int balance;
	private String status;
	private String withdrawstatus;
	private String depositstatus;
	private String transferstatus;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String acnum) {
		this.accountno = acnum;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String a3) {
		this.custid = a3;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWithdrawstatus() {
		return withdrawstatus;
	}
	public void setWithdrawstatus(String withdrawstatus) {
		this.withdrawstatus = withdrawstatus;
	}
	public String getDepositstatus() {
		return depositstatus;
	}
	public void setDepositstatus(String depositstatus) {
		this.depositstatus = depositstatus;
	}
	public String getTransferstatus() {
		return transferstatus;
	}
	public void setTransferstatus(String transferstatus) {
		this.transferstatus = transferstatus;
	}
	@Override
	public String toString() {
		return String.format(
				"BankUser [fname=%s, lname=%s, uname=%s, password=%s, accounttype=%s, mobno=%s, gender=%s, dob=%s, adharno=%s, address=%s, email=%s, country=%s, accountno=%s, custid=%s, balance=%s, status=%s]",
				fname, lname, uname, password, accounttype, mobno, gender, dob, adharno, address, email, country,
				accountno, custid, balance, status);
	}
	
}
