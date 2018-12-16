package kr.ac.hansung.web.cyd.subjectmanager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.web.cyd.subjectmanager.model.Register;

@Repository
public class RegisterDAO {
	
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from register";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	public List<Register> getRegisterList() {
		String sqlStatement = "select * from register";
		List<Register> registerList = jdbcTemplateObject.query(sqlStatement, new RowMapper<Register>() {

			@Override
			public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
				Register register = new Register();

				register.setCourse_code(rs.getString("course_code"));
				register.setCourse_name(rs.getString("course_name"));
				register.setCourse_type(rs.getString("course_type"));
				register.setCourse_point(rs.getInt("course_point"));

				return register;
			}
		});
		return registerList;
	}
	
	public boolean insert(Register register) {
		
		String course_code = register.getCourse_code();
		String course_name = register.getCourse_name();
		String course_type = register.getCourse_type();
		int course_point = register.getCourse_point(); 
		
		String sqlStatement = "insert into register (course_code, course_name, course_type, course_point) values (?, ?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{course_code, course_name, course_type, course_point}) == 1);
		
	}
	
	
}
