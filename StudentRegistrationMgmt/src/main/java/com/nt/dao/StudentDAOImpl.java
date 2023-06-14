package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements IStudentDAO {
	private static final String QUERY = "INSERT INTO STUDENTREG VALUES(STUDENTSEQ.NEXTVAL,?,?,?,?,?)";
	private static final String QUERY1 = "SELECT * FROM STUDENTREG WHERE SNO=?";

	private DataSource dataSource;

	public StudentDAOImpl(DataSource dataSource) {
		System.out.println("StudentDAOImpl::1-param Constructor");
		this.dataSource = dataSource;
	}

	@Override
	public int insertRecord(StudentBO bo) throws Exception {

		int res = 0;
		try (Connection con = dataSource.getConnection(); PreparedStatement pstm = con.prepareStatement(QUERY);) {
			pstm.setString(1, bo.getName());
			pstm.setFloat(2, bo.getMark1());
			pstm.setFloat(3, bo.getMark2());
			pstm.setFloat(4, bo.getMark3());
			pstm.setFloat(5, bo.getTmark());
			res = pstm.executeUpdate();
			return res;
		} catch (SQLException s) {
			s.printStackTrace();
			throw s;
		} catch (Exception s) {
			s.printStackTrace();
			throw s;
		}
	}

	@Override
	public boolean retriveRecord(StudentBO bo) throws Exception {
		try (Connection con = dataSource.getConnection(); PreparedStatement pstm = con.prepareStatement(QUERY1);) {
			pstm.setInt(1, bo.getId());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				ResultSetMetaData rmdt = rs.getMetaData();
				int n = rmdt.getColumnCount();
				for (int i = 1; i <= n; i++) {
					System.out.print(rmdt.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println("*".repeat(50));
				System.out.println("StudentId  :"+rs.getInt(1));
				System.out.println("Student Name   :"+rs.getString(2));
				System.out.println("Student mark1   :"+rs.getFloat(3));
				System.out.println("Student Mark2   :"+rs.getFloat(4));
				System.out.println("Student Mark3   :"+rs.getFloat(5));
				System.out.println("Total Mark   :"+rs.getFloat(6));
				System.out.println("*".repeat(50));
				return true;
				
			} else
				return false;
		}
	}
}