package org.capstoneproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.capstoneproject.model.BankUser;
import org.capstoneproject.model.Checkbook;
import org.capstoneproject.model.Recipient;
import org.capstoneproject.model.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BankUserDaoImpl implements BankUserDao {


	private JdbcTemplate jdbcTemplate;

	public BankUserDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	@Override
	public int userregister(BankUser user) {
		String sql = "INSERT INTO capstone.bankuser(fname,lname,uname,password,accounttype,dob,gender,mobno,address,adharno,email,country,accountno,custid,balance,status,withdrawstatus,depositstatus,transferstatus) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { user.getFname(),user.getLname(),user.getUname(),user.getPassword(),user.getAccounttype(), user.getDob(),user.getGender(), user.getMobno(),user.getAddress(),user.getAdharno(),user.getEmail(),user.getCountry(),user.getAccountno(),user.getCustid(),user.getBalance(),user.getStatus(),user.getWithdrawstatus(),user.getDepositstatus(),user.getTransferstatus()});

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int checklogin(String cid, String pass) {
String sql="select * from bankuser where custid='"+cid+"' and password='"+pass+"'";
		
		List<BankUser> s=jdbcTemplate.query(sql, new UserMapper());
		 return s.size() >0 ?1 :0;
	}
	class UserMapper implements RowMapper<BankUser>
	{
		public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							BankUser a = new BankUser();
							a.setUname(rs.getString("uname"));
							return a;
						}
	}
	@Override
	public List<BankUser> balance(int cid) {
		List<BankUser> ll = jdbcTemplate.query("SELECT * FROM bankuser where custid='"+cid+"'", new RowMapper<BankUser>() {

			@Override
			public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				BankUser b = new BankUser();

				b.setBalance(rs.getInt("balance"));
				return b;
			}

		});

		return ll;
	}

	@Override
	public List<BankUser> getbal(String aid) {
		List<BankUser> ll = jdbcTemplate.query("SELECT * FROM bankuser where accountno='"+aid+"'", new RowMapper<BankUser>() {

			@Override
			public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				BankUser b = new BankUser();

				b.setBalance(rs.getInt("balance"));
				b.setCustid(rs.getString("custid"));
				b.setAccounttype(rs.getString("accounttype"));
				b.setUname(rs.getString("uname"));
				b.setAccountno(rs.getString("accountno"));
				return b;
			}

		});
		return ll;
	}

	@Override
	public int balwithdraw(String aid, String pass, int y) {
		String sql = "UPDATE bankuser SET balance=? where accountno=? and password=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { y,aid,pass});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deposit(String aid, int y) {
		String sql = "UPDATE bankuser SET balance=? where accountno=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { y,aid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int inserttrans(Transaction trans) {
		String sql = "INSERT INTO capstone.transaction(tid,accid,amount,balance,time,date,cid,toperson,fromperson,type) values(?,?,?,?,?,?,?,?,?,?)";
		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { trans.getTid(),trans.getAccid(),trans.getAmount(),trans.getBalance(),trans.getTime(),trans.getDate(),trans.getCid(),trans.getToperson(),trans.getFromperson(),trans.getType()});

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public int depositss(String aid, int y, String pass) {
		String sql = "UPDATE bankuser SET balance=? where accountno=? and password=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { y,aid,pass});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Transaction> transactionhistory(int cid) {
     List<Transaction> ll = jdbcTemplate.query("select * from transaction where cid='"+cid+"'", new RowMapper<Transaction>() {

			@Override
			public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
				Transaction c = new Transaction();

				c.setAccid(rs.getString("accid"));
				c.setTid(rs.getInt("tid"));
				c.setAmount(rs.getInt("amount"));
				c.setTime(rs.getString("time"));
				c.setDate(rs.getString("date"));
				c.setToperson(rs.getString("toperson"));
				c.setFromperson(rs.getString("fromperson"));
				c.setBalance(rs.getInt("balance"));
				c.setType(rs.getString("type"));

				return c;
			}

		});

		return ll;
	}

	@Override
	public int checkStatus(String cid,String a) {
		String sql = "SELECT * from bankuser where custid='"+cid+"' and status='"+a+"'";
		List<BankUser> s=jdbcTemplate.query(sql, new UserMapper());
		 return s.size() >0 ?1 :0;
	}
	class UserMapper2 implements RowMapper<BankUser>
	{
		public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							BankUser a = new BankUser();
							a.setUname(rs.getString("uname"));
							return a;
						}
}
	@Override
	public List<BankUser> getdetails(int cid) {
List<BankUser> ll = jdbcTemplate.query("select * from bankuser where custid='"+cid+"'", new RowMapper<BankUser>() {

	@Override
	public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		BankUser c = new BankUser();
		
		c.setAccountno(rs.getString("accountno"));
		c.setAddress(rs.getString("address"));
		c.setUname(rs.getString("uname"));
		c.setMobno(rs.getString("mobno"));
		c.setCustid(rs.getString("custid"));
		c.setAccounttype(rs.getString("accounttype"));
		return c;
	}

});

return ll;
	
}

	@Override
	public int requestcheckbookinsertion(String uname, String address, String mobno, String accounttype, String acno,
			String custid,String a) {
		String sql = "INSERT INTO capstone.checkbook(uname,accounttype,mobno,address,accountno,custid,status) values(?,?,?,?,?,?,?)";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { uname,accounttype,mobno,address,acno,custid,a });
			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<BankUser> user() {
		List<BankUser> ll = jdbcTemplate.query("select * from bankuser", new RowMapper<BankUser>() {

			@Override
			public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				BankUser c = new BankUser();
				
				c.setAccountno(rs.getString("accountno"));
				c.setAddress(rs.getString("address"));
				c.setUname(rs.getString("uname"));
				c.setMobno(rs.getString("mobno"));
				c.setCustid(rs.getString("custid"));
				c.setAccounttype(rs.getString("accounttype"));
				c.setAdharno(rs.getString("adharno"));
				return c;
			}

		});
		return ll;
	}

	@Override
	public int block(int cid,String a) {
		String sql = "UPDATE bankuser SET status=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int unblock(int cid, String a) {
		String sql = "UPDATE bankuser SET status=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int withdrawallow(int cid, String a) {
		String sql = "UPDATE bankuser SET withdrawstatus=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int withdrawdeny(int cid, String a) {
		String sql = "UPDATE bankuser SET withdrawstatus=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public int depositdeny(int cid, String a) {
		String sql = "UPDATE bankuser SET depositstatus=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int depositallow(int cid, String a) {
		String sql = "UPDATE bankuser SET depositstatus=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int tbtwaccallow(int cid, String a) {
		String sql = "UPDATE bankuser SET transferstatus=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int tbtwaccdeny(int cid, String a) {
		String sql = "UPDATE bankuser SET transferstatus=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int checkStatuswd(String cid, String a) {
		String sql = "SELECT * from bankuser where custid='"+cid+"' and withdrawstatus='"+a+"'";
		List<BankUser> s=jdbcTemplate.query(sql, new UserMapper());
		 return s.size() >0 ?1 :0;
	}
	class UserMapper3 implements RowMapper<BankUser>
	{
		public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							BankUser a = new BankUser();
							a.setUname(rs.getString("uname"));
							return a;
						}
	}
	@Override
	public int checkStatusdeposit(String cid, String a) {
		String sql = "SELECT * from bankuser where custid='"+cid+"' and depositstatus='"+a+"'";
		List<BankUser> s=jdbcTemplate.query(sql, new UserMapper());
		 return s.size() >0 ?1 :0;
	}
	class UserMapper4 implements RowMapper<BankUser>
	{
		public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							BankUser a = new BankUser();
							a.setUname(rs.getString("uname"));
							return a;
						}
	}
	@Override
	public int checkStatustransferbtwacc(String cid, String a) {
		String sql = "SELECT * from bankuser where custid='"+cid+"' and transferstatus='"+a+"'";
		List<BankUser> s=jdbcTemplate.query(sql, new UserMapper());
		 return s.size() >0 ?1 :0;
	}
	class UserMapper5 implements RowMapper<BankUser>
	{
		public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
							BankUser a = new BankUser();
							a.setUname(rs.getString("uname"));
							return a;
						}
	}
	@Override
	public List<Checkbook> checkbookdetails() {
		List<Checkbook> ll = jdbcTemplate.query("select * from checkbook", new RowMapper<Checkbook>() {

			@Override
			public Checkbook mapRow(ResultSet rs, int rowNum) throws SQLException {
				Checkbook c = new Checkbook();
				
				c.setAccountno(rs.getString("accountno"));
				c.setAddress(rs.getString("address"));
				c.setUname(rs.getString("uname"));
				c.setMobno(rs.getString("mobno"));
				c.setCustid(rs.getString("custid"));
				c.setAccounttype(rs.getString("accounttype"));
		//		c.setAdharno(rs.getString("adharno"));
				return c;
			}

		});
		return ll;
	}

	@Override
	public int checkbookgrant(int cid, String a) {
		String sql = "UPDATE checkbook SET status=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int checkbookdeny(int cid, String a) {
		String sql = "UPDATE checkbook SET status=? where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { a,cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Checkbook> notification(int cid) {
		List<Checkbook> ll = jdbcTemplate.query("SELECT * FROM checkbook where custid='"+cid+"'", new RowMapper<Checkbook>() {

			@Override
			public Checkbook mapRow(ResultSet rs, int rowNum) throws SQLException {
				Checkbook b = new Checkbook();

				b.setStatus(rs.getString("status"));
				
				return b;
			}

		});
		return ll;
}

	@Override
	public int checkbookdel(int cid) {
		String sql = "DELETE from checkbook where custid=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] {cid});
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Recipient> retrieverecipient(String cid) {
		List<Recipient> ll = jdbcTemplate.query("SELECT * FROM recipient where scid='"+cid+"'", new RowMapper<Recipient>() {

			@Override
			public Recipient mapRow(ResultSet rs, int rowNum) throws SQLException {
				Recipient b = new Recipient();

				b.setName(rs.getString("name"));
				b.setAccid(rs.getString("accid"));
				b.setAcctype(rs.getString("acctype"));
				b.setMobno(rs.getString("mobno"));
				
				return b;
			}

		});
		return ll;
	}

	@Override
	public int insertrecipient(Recipient r) {
		String sql = "INSERT INTO capstone.recipient(accid,acctype,mobno,name,scid) values(?,?,?,?,?)";
		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { r.getAccid(),r.getAcctype(),r.getMobno(),r.getName(),r.getScid() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Recipient> retrieverecipientparticular(String cid, String raccid) {
		List<Recipient> ll = jdbcTemplate.query("SELECT * FROM recipient where scid='"+cid+"' and accid='"+raccid+"'", new RowMapper<Recipient>() {

			@Override
			public Recipient mapRow(ResultSet rs, int rowNum) throws SQLException {
				Recipient b = new Recipient();

				b.setName(rs.getString("name"));
				b.setAccid(rs.getString("accid"));
				b.setAcctype(rs.getString("acctype"));
				b.setMobno(rs.getString("mobno"));
				
				return b;
			}

		});
		return ll;
	}

	@Override
	public List<BankUser> getdetailsaccid(String accid) {
		List<BankUser> ll = jdbcTemplate.query("SELECT * FROM bankuser where accountno='"+accid+"'", new RowMapper<BankUser>() {

			@Override
			public BankUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				BankUser b = new BankUser();

				b.setBalance(rs.getInt("balance"));
				b.setCustid(rs.getString("custid"));
				return b;
			}

		});
		return ll;
	}
}