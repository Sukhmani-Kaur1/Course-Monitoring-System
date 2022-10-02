package com.cms.usecases;

import java.util.Scanner;

import com.cms.bean.Batch;
import com.cms.bean.Course;
import com.cms.bean.Faculty;
import com.cms.dao.AdministratorDao;
import com.cms.daoImpl.AdministratorDaoImpl;

public class Main {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Type of user A(administrator) or F(faculty)");
	char user = sc.next().charAt(0);
	
	if(user=='A'||user=='a') {
	AdministratorDao ad = new AdministratorDaoImpl();
	System.out.println("Enter username:");
	String username = sc.next();
	System.out.println("Enter password:");
	String pass = sc.next();
	Boolean check = ad.loginAdmin(username, pass);
	if(check==true) {
		System.out.println("Login Successfull...");
	    System.out.println("Enter the Area for execution course(c)/batch(b)/faculty(f)/courseplan(p)");
	    char type = sc.next().charAt(0);
	    if(type=='c') {
	    	Course.doOperations();
	    }else if(type=='b') {
	    	Batch.doOperations();
	    }else if(type=='f') {
	    	Faculty.doOperations();
	    }
	}else {
		System.out.println("Wront username or password...");
	}
	}else if(user=='F'||user=='f') {
		
	}
	System.out.println("end of app");
	
	
	
}
}
