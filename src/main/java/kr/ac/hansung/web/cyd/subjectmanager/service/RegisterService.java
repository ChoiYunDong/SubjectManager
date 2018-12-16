package kr.ac.hansung.web.cyd.subjectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.web.cyd.subjectmanager.dao.RegisterDAO;
import kr.ac.hansung.web.cyd.subjectmanager.model.Course;
import kr.ac.hansung.web.cyd.subjectmanager.model.Register;

@Service
public class RegisterService {
	@Autowired
	private RegisterDAO registerDAO;
 
	public List<Register> getRegisterList() {
		return registerDAO.getRegisterList();
	}
	
	public void insert(Register register) {
		registerDAO.insert(register);
	}
}
