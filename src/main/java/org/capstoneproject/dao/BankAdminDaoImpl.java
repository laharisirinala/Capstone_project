package org.capstoneproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.capstoneproject.dao.BankAdminDaoImpl.UserMapper;
import org.capstoneproject.model.BankAdmin;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BankAdminDaoImpl implements BankAdminDao {

	private JdbcTemplate jdbcTemplate;

	public BankAdminDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}
	@Override
	public int alogin(String aname, String pass) {
String sql="select * from bankadmin where aname='"+aname+"' and password='"+pass+"'";
		
		List<BankAdmin> s=jdbcTemplate.query(sql, new UserMapper());
		 return s.size() >0 ?1 :0;
	}
	class UserMapper implements RowMapper<BankAdmin>
	{
		public BankAdmin mapRow(ResultSet rs, int rowNum) throws SQLException {
							BankAdmin a = new BankAdmin();
							a.setAname(rs.getString("aname"));
							return a;
						}
	}

}
