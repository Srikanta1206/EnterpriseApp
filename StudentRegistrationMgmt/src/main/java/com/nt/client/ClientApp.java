package com.nt.client;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.MainControllerLayer;
import com.nt.vo.StudentVO;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"src/main/java/com/nt/cfg/applicationContext.xml");
		MainControllerLayer control = context.getBean("control", MainControllerLayer.class);
		Scanner sc = new Scanner(System.in);

		StudentVO sv = new StudentVO();

//		String result=control.ProcessEmployee(sv);
//		System.out.println(result);
		System.out.println("*".repeat(20));
		System.out.println("choose");
		System.out.println("1.Enter Student mark\n2.Student result");
		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter mark1");
			String mark1 = sc.nextLine();
			System.out.println("Enter mark2");
			String mark2 = sc.nextLine();
			System.out.println("Enter mark3");
			String mark3 = sc.nextLine();
			String result = control.ProcessEmployee(sv);
			System.out.println(result);
			sv.setName(name);
			sv.setMark1(mark1);
			sv.setMark2(mark2);
			sv.setMark3(mark3);
			break;
		case 2:
			System.out.println("Enter RollNo");
			String rollNo=sc.nextLine();
			sv.setId(rollNo);
			String result1 = control.result(sv);
			System.out.println(result1);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}
}
