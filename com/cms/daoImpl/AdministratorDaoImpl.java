package com.cms.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cms.bean.Batch;
import com.cms.bean.Course;
import com.cms.bean.Faculty;
import com.cms.dao.AdministratorDao;
import com.cms.utility.DBUtil;

public class AdministratorDaoImpl implements AdministratorDao{

	@Override
	public String registerCourse(Course course) {
		String message = "Not Inserted..";
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into course values(?,?,?,?)");
			ps.setInt(1, course.getCourseid());
			ps.setString(2, course.getCoursename());
			ps.setInt(3, course.getFee());
			ps.setString(4, course.getCoursedescription());
			int x = ps.executeUpdate();
			if(x>0)
				message = "Inserted...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return message;
		
	}

	@Override
	public Course getCourseById(int courseid) {
		Course course= null;
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from course where courseid = ?");
			ps.setInt(1, courseid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("courseid");
				String name = rs.getString("coursename");
				int fee = rs.getInt("fee");
				String desc = rs.getString("coursedescription");
				course = new Course(id,name,fee,desc);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		return course;
	}

	@Override
	public Boolean loginAdmin(String user, String pass) {
		Boolean message = false;
		
	
			try(Connection conn = DBUtil.provideConnection()) {
				PreparedStatement ps = conn.prepareStatement("select * from Admin where username = ? AND password = ?");
				ps.setString(1, user);
				ps.setString(2, pass);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					message = true;
				}else {
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		return message;
	}

	@Override
	public String registerBatch(Batch batch) {
		String message = "Not Inserted..";
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into batch values(?,?,?,?,?,?)");
			ps.setInt(1, batch.getBatchid());
			ps.setInt(2, batch.getCourseid());
			ps.setInt(3, batch.getFacultyid());
			ps.setInt(4, batch.getNoOfStudent());
			ps.setString(5, batch.getStartDate());
			ps.setString(6, batch.getDuration());
			int x = ps.executeUpdate();
			if(x>0)
				message = "Inserted...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String registerAdmin(String user, String pass) {
		String message = "Not Inserted..";
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into admin values(?,?)");
			ps.setString(1, user);
			ps.setString(2, pass);
			int x = ps.executeUpdate();
			if(x>0)
				message = "Inserted...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String addFaculty(Faculty faculty) {
		String message = "Not Inserted..";
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into facultyf values(?,?,?,?,?,?,?)");
			ps.setInt(1, faculty.getFacultyid());
			ps.setString(2, faculty.getFacultyname());
			ps.setString(3, faculty.getFacultyaddress());
			ps.setString(4, faculty.getMobile());
			ps.setString(5, faculty.getEmail());
			ps.setString(6, faculty.getUsername());
			ps.setString(7, faculty.getPassword());
			int x = ps.executeUpdate();
			if(x>0)
				message = "Inserted...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return message;
	}

}
