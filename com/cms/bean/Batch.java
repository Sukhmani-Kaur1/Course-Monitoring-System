package com.cms.bean;


import java.util.Scanner;

import com.cms.dao.AdministratorDao;
import com.cms.daoImpl.AdministratorDaoImpl;

public class Batch {
		private int batchid;
		private int courseid;
		private int facultyid;
		private int noOfStudent;
		private String startDate;
		private String duration;
		public Batch() {
			
		}
		public Batch(int batchid, int courseid, int facultyid, int noOfStudent, String startDate, String duration) {
			super();
			this.batchid = batchid;
			this.courseid = courseid;
			this.facultyid = facultyid;
			this.noOfStudent = noOfStudent;
			this.startDate = startDate;
			this.duration = duration;
		}
		public static Batch batchAdd() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter batch id: ");
			int id = sc.nextInt();
			System.out.println("Enter course id: ");
			int cid = sc.nextInt();
			System.out.println("Enter Faculty id: ");
			int fid = sc.nextInt();
			System.out.println("Enter number of student: ");
			int num = sc.nextInt();

	        System.out.println("Enter Start date yyyy-mm-dd: ");
	        String cinput = sc.next();
			
			System.out.println("Enter duration of the course: ");
			String duration= sc.next();
			Batch batch = new Batch();
			batch.setBatchid(id);
			batch.setDuration(duration);
			batch.setCourseid(cid);
			batch.setFacultyid(fid);
			batch.setNoOfStudent(num);
			batch.setStartDate(cinput);
			sc.close();
			return batch;
		}
		public static void doOperations() {
			Scanner sc = new Scanner(System.in);
			AdministratorDao ad = new AdministratorDaoImpl();
			System.out.println("Enter opration you want to perform insert(1),update(2), view(3)");
			int op = sc.nextInt();
			switch(op){
			case 1:
				Batch batch = Batch.batchAdd();
				String result = ad.registerBatch(batch);
				System.out.println(result);
				break;
				
			}
			sc.close();
		}
		@Override
		public String toString() {
			return "Batch [batchid=" + batchid + ", courseid=" + courseid + ", facultyid=" + facultyid
					+ ", noOfStudent=" + noOfStudent + ", startDate=" + startDate + ", duration=" + duration + "]";
		}
		public int getBatchid() {
			return batchid;
		}
		public void setBatchid(int batchid) {
			this.batchid = batchid;
		}
		public int getCourseid() {
			return courseid;
		}
		public void setCourseid(int courseid) {
			this.courseid = courseid;
		}
		public int getFacultyid() {
			return facultyid;
		}
		public void setFacultyid(int facultyid) {
			this.facultyid = facultyid;
		}
		public int getNoOfStudent() {
			return noOfStudent;
		}
		public void setNoOfStudent(int noOfStudent) {
			this.noOfStudent = noOfStudent;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		
		
		
}
