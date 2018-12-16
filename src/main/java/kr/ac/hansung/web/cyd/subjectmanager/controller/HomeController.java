package kr.ac.hansung.web.cyd.subjectmanager.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.web.cyd.subjectmanager.model.Course;
import kr.ac.hansung.web.cyd.subjectmanager.service.CourseService;


@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}

	
	@RequestMapping(value = "/semesterPoints", method = RequestMethod.GET)
	public String getCoursePointBySemester(Model model) {
		List<Course> semesterPoints = courseService.getGroupBy_Year_Semester();

		model.addAttribute("semesterPoints", semesterPoints);

		return "semesterPointForm";
	}
	
	@RequestMapping(value = "/typePoints", method = RequestMethod.GET)
	public String getCoursePointByType(Model model) {
		List<Course> typePoints = courseService.getGroupBy_Type();

		model.addAttribute("typePoints", typePoints);

		return "typePointForm";
	}
	
	@RequestMapping(value="/yearSemesterCourse", method = RequestMethod.GET)
	public String getDetailSemsterPoint(Integer course_year, String course_semester, Model model) {
		List<Course> coursenameList = courseService.getYearSemester_Detail(course_year, course_semester);
		
		model.addAttribute("course_year", course_year);
		model.addAttribute("course_semester", course_semester);
		model.addAttribute("coursenameList", coursenameList);
		return "detailCourse";
	}
}
