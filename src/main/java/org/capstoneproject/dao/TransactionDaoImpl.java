package org.capstoneproject.dao;

import javax.sql.DataSource;

import org.capstoneproject.model.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionDaoImpl implements TransactionDao {

	private JdbcTemplate jdbcTemplate;

	public TransactionDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}
	@Override
	public int inserttrans(Transaction trans) {
		String sql = "INSERT INTO capstone.transaction(tid,accid,amount,balance,time,date,toperson,cid,fromperson,type) values(?,?,?,?,?,?,?,?,?,?)";
		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { trans.getTid(),trans.getAccid(),trans.getAmount(),trans.getBalance(),trans.getTime(),trans.getDate(),trans.getToperson(),trans.getCid(),trans.getFromperson(),trans.getType()});

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
}}

