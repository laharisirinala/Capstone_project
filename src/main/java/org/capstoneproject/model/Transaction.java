package org.capstoneproject.model;

public class Transaction {

	private int tid;
	private String accid;
	private int amount;
	private int balance;
	private String time;
	private String date;
	private String toperson;
	private String fromperson;
	private String cid;
	private String type;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getAccid() {
		return accid;
	}
	public void setAccid(String accid) {
		this.accid = accid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount2) {
		this.amount = amount2;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int bal) {
		this.balance = bal;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getToperson() {
		return toperson;
	}
	public void setToperson(String toperson) {
		this.toperson = toperson;
	}
	public String getFromperson() {
		return fromperson;
	}
	public void setFromperson(String fromperson) {
		this.fromperson = fromperson;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
}
