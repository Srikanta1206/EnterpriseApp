package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.IStudentDAO;
import com.nt.dto.StudentDTO;

public class StudentMgmtService implements IStudentMgmtService {

	private IStudentDAO dao;

	public StudentMgmtService(IStudentDAO dao) {
		System.out.println("StudentMgmtService::1-param Constructor");
		this.dao = dao;
	}

	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
		int tmark = dto.getMark1() + dto.getMark2() + dto.getMark3();

		StudentBO bo = new StudentBO();
		bo.setName(dto.getName());
		bo.setMark1(dto.getMark1());
		bo.setMark2(dto.getMark2());
		bo.setMark3(dto.getMark3());
		bo.setTmark(tmark);
		int res = dao.insertRecord(bo);

//		return res==1?"Employee register Successful with rollNO  :"+bo.getId():
//			"Employee is Not Registered";

		if (res == 1)
			return "Employee registered successful";
		else
			return "Employee is not registered";
	}

	@Override
	public String studentResult(StudentDTO dto)throws Exception {
		int sNo=dto.getId();
		StudentBO bo=new StudentBO();
		bo.setId(sNo);
		boolean result=dao.retriveRecord(bo);
		
		if(result==true)
			return "Student Data retrive successfully";
		else
			return "Student record not found";
	
	}
}
