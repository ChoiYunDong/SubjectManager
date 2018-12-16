package kr.ac.hansung.web.cyd.subjectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.web.cyd.subjectmanager.dao.CourseDAO;
import kr.ac.hansung.web.cyd.subjectmanager.model.Course;

@Service
public class CourseService {
	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> getGroupBy_Year_Semester(){
		return courseDAO.getGroupBy_Year_Semester();
	}

	public List<Course> getGroupBy_Type() {
		return courseDAO.getGroupBy_Type();
	}
	
	public List<Course> getYearSemester_Detail(int course_year, String course_semester) {
		return courseDAO.getYearSemester_Detail(course_year, course_semester);
	}
}
