package kr.ac.hansung.web.cyd.subjectmanager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.web.cyd.subjectmanager.model.Register;

public class RegisterMapper implements RowMapper<Register>{
	@Override
	public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
		Register register = new Register();
		
		register.setCourse_code(rs.getString("course_code"));
		register.setCourse_name(rs.getString("course_name"));
		register.setCourse_type(rs.getString("course_type"));
		register.setCourse_point(rs.getInt("course_point"));
		
		return register;
	}
}