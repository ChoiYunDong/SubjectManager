package kr.ac.hansung.web.cyd.subjectmanager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.web.cyd.subjectmanager.model.Course;

@Repository
public class CourseDAO {
	private JdbcTemplate jdbcTemplateObject;

	// �б⺰ �̼����� ��Ȳ
	public List<Course> getGroupBy_Year_Semester() {
		String sqlStatement = "SELECT course_year, course_semester, SUM(course_point) " + "FROM course "
				+ "GROUP BY course_year, course_semester " + "ORDER BY course_year, course_semester";

		List<Course> courseList = jdbcTemplateObject.query(sqlStatement, new RowMapper<Course>() {

			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();

				course.setCourse_year(rs.getInt("course_year"));
				course.setCourse_semester(rs.getString("course_semester"));
				course.setCourse_point(rs.getInt("SUM(course_point)"));

				return course;
			}
		});
		return courseList;
	}

	// �̼� ���к� �̼����� ��Ȳ
	public List<Course> getGroupBy_Type() {
		String sqlStatement = "SELECT course_type, SUM(course_point) " + "FROM course "
				+ "GROUP BY course_type;";

		List<Course> courseList = jdbcTemplateObject.query(sqlStatement, new RowMapper<Course>() {

			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();

				course.setCourse_type(rs.getString("course_type"));
				course.setCourse_point(rs.getInt("SUM(course_point)"));

				return course;
			}
		});
		return courseList;
	}
	
	public List<Course> getYearSemester_Detail(int course_year, String course_semester){
		String sqlStatement = "SELECT * " 
							+ "FROM course " 
							+ "WHERE course_year = ? AND course_semester = ?";
		
		List<Course> courseList = jdbcTemplateObject.query(sqlStatement, new Object[]{course_year, course_semester}, new CourseMapper());
		
		return courseList;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
}
