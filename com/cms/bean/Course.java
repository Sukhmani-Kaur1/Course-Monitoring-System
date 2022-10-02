package com.cms.bean;

import java.util.Scanner;

import com.cms.dao.AdministratorDao;
import com.cms.daoImpl.AdministratorDaoImpl;

public class Course {
	
	private int courseid;
	private String coursename;
	private int fee;
	private String coursedescription;
	public Course(int courseid, String coursename, int fee, String coursedescription) {
	
		this.courseid = courseid;
		this.coursename = coursename;
		this.fee = fee;
		this.coursedescription = coursedescription;
	}
	public Course() {
		
	}
	public static Course CourseAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course id: ");
		int id = sc.nextInt();
		System.out.println("Enter course name: ");
		String name= sc.next();
		System.out.println("Enter course fee: ");
		int fee = sc.nextInt();
		System.out.println("Enter course description: ");
		String desc = sc.next();
		Course course = new Course();
		course.setCourseid(id);
		course.setCoursename(name);
		course.setCoursedescription(desc);
		course.setFee(fee);
		return course;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", fee=" + fee + ", coursedescription="
				+ coursedescription + "]";
	}
	public static void doOperations() {
		Scanner sc = new Scanner(System.in);
		AdministratorDao ad = new AdministratorDaoImpl();
		System.out.println("Enter opration you want to perform insert(1),update(2), view(3)");
		int op = sc.nextInt();
		switch(op){
		case 1:
			Course course = Course.CourseAdd();
			String result = ad.registerCourse(course);
			System.out.println(result);
			break;
		case 2:
			
			
			break;
		case 3: 
			System.out.println("Enter course id:");
			int id = sc.nextInt();
			Course couse = ad.getCourseById(id);
			if(couse!=null)
			System.out.println(couse);
			else {
				System.out.println("Course doesn't exist");
			}
			
			break;
			
		}
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	
	
	

}
