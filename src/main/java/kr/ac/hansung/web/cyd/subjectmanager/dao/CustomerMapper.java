package kr.ac.hansung.web.cyd.subjectmanager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.web.cyd.subjectmanager.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	
	@Override
	public Customer mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		Customer customer = new Customer();
		customer.setId(rs.getString("id"));
		customer.setPassword(rs.getString("password"));
		
		return customer;
	}
	

}
