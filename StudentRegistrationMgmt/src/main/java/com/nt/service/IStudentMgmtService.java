package com.nt.service;

import com.nt.dto.StudentDTO;

public interface IStudentMgmtService {
	public String registerStudent(StudentDTO dto) throws Exception;
	public String studentResult(StudentDTO dto) throws Exception;
}
