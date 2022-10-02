package com.cms.bean;

import java.util.Scanner;

import com.cms.dao.AdministratorDao;
import com.cms.daoImpl.AdministratorDaoImpl;

public class Faculty {
  private int facultyid;
  private String facultyname;
  private String facultyaddress;
  private String mobile;
  private String email;
  private String username;
  private String password;
  public Faculty() {
	  
  }
public Faculty(int facultyid, String facultyname, String facultyaddress, String mobile, String email, String username,
		String password) {
	super();
	this.facultyid = facultyid;
	this.facultyname = facultyname;
	this.facultyaddress = facultyaddress;
	this.mobile = mobile;
	this.email = email;
	this.username = username;
	this.password = password;
}
public int getFacultyid() {
	return facultyid;
}
public void setFacultyid(int facultyid) {
	this.facultyid = facultyid;
}
public String getFacultyname() {
	return facultyname;
}
public void setFacultyname(String facultyname) {
	this.facultyname = facultyname;
}
public String getFacultyaddress() {
	return facultyaddress;
}
public void setFacultyaddress(String facultyaddress) {
	this.facultyaddress = facultyaddress;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Faculty [facultyid=" + facultyid + ", facultyname=" + facultyname + ", facultyaddress=" + facultyaddress
			+ ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password=" + password + "]";
}
  public static Faculty facultyAdd() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty id: ");
		int fid = sc.nextInt();
		System.out.println("Enter Faculty name: ");
		String fname = sc.next();
		System.out.println("Enter Faculty address: ");
		String fadr = sc.next();
		System.out.println("Enter Faculty mobile: ");
		String fmobile = sc.next();
		System.out.println("Enter Faculty email: ");
		String femail = sc.next();
		System.out.println("Enter Faculty username: ");
		String fuser = sc.next();
		System.out.println("Enter Faculty password: ");
		String fpass = sc.next();
		
		Faculty faculty = new Faculty();
		faculty.setFacultyid(fid);
		faculty.setFacultyname(fname);
		faculty.setFacultyaddress(fadr);
		faculty.setEmail(femail);
		faculty.setMobile(fmobile);
		faculty.setPassword(fpass);
		faculty.setUsername(fuser);
		sc.close();
		return faculty;
  }
  public static void doOperations() {
		Scanner sc = new Scanner(System.in);
		AdministratorDao ad = new AdministratorDaoImpl();
		System.out.println("Enter opration you want to perform insert(1),update(2), view(3)");
		int op = sc.nextInt();
		switch(op){
		case 1:
			Faculty faculty = Faculty.facultyAdd();
			String result = ad.addFaculty(faculty);
			System.out.println(result);
			break;
			
		}
		sc.close();
	}
  
}
