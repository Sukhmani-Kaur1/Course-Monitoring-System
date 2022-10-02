package com.cms.dao;

import com.cms.bean.Batch;
import com.cms.bean.Course;
import com.cms.bean.Faculty;

public interface AdministratorDao {
     public String registerCourse(Course course);
     public Course getCourseById(int courseid);
     public Boolean loginAdmin(String user,String pass);
     public String registerBatch(Batch batch);
     public String registerAdmin(String user,String pass);
     public String addFaculty(Faculty faculty);


}
