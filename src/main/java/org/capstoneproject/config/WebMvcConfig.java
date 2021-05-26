package org.capstoneproject.config;

import org.capstoneproject.dao.BankAdminDao;
import org.capstoneproject.dao.BankAdminDaoImpl;
import org.capstoneproject.dao.BankUserDaoImpl;
import org.capstoneproject.dao.TransactionDao;
import org.capstoneproject.dao.TransactionDaoImpl;
import org.capstoneproject.dao.BankUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.capstoneproject")
public class WebMvcConfig {

	@Bean
	InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}

	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/capstone?useSSl=false");
		ds.setUsername("root");
		ds.setPassword("lahari@89");

		return ds;
	}


	@Bean
	public BankUserDao getBankUserDao() {
		return new BankUserDaoImpl(getDataSource());
	}
	@Bean
	public BankAdminDao getUserDao5() {
		return new BankAdminDaoImpl(getDataSource());
	}
}