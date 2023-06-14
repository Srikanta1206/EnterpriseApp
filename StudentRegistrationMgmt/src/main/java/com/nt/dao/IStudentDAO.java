package com.nt.dao;

import com.nt.bo.StudentBO;

public interface IStudentDAO {
	int insertRecord(StudentBO bo) throws Exception;
	boolean retriveRecord(StudentBO bo) throws Exception;
	
}
