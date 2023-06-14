package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentMgmtService;
import com.nt.vo.StudentVO;

public class MainControllerLayer {
	private IStudentMgmtService service=null;
	
	public MainControllerLayer(IStudentMgmtService service) {
		System.out.println("MainControllerLayer::1 parem Constructor");
		this.service=service;
	}
	
	public String ProcessEmployee(StudentVO vo) throws Exception{
		System.out.println("Employee is Under Processing");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		StudentDTO dto=new StudentDTO();
		dto.setName(vo.getName());
		dto.setMark1(Integer.parseInt(vo.getMark1()));
		dto.setMark2(Integer.parseInt(vo.getMark2()));
		dto.setMark3(Integer.parseInt(vo.getMark3()));
		
		String result=service.registerStudent(dto);
		return result;
	}
	
	public String result(StudentVO vo)throws Exception {
		StudentDTO dto=new StudentDTO();
		dto.setId(Integer.parseInt(vo.getId()));
		String result=service.studentResult(dto);
		return result;
	}
}
