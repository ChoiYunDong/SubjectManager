package kr.ac.hansung.web.cyd.subjectmanager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {
	private Integer course_year;
	private String course_semester;
	private String course_code;
	private String course_name;
	private String course_type;
	private int course_point;
}
