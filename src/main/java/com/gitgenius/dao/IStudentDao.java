package com.gitgenius.dao;

import java.util.Map;

import com.gitgenius.model.Student;

public interface IStudentDao {
	
	void addStudent(Student s);
	void modifyStudent(Student s);
	Student getOneStudent(Integer id);
	Map<Integer,Student> getAllStudent();
	void removeStudent(Integer id);

}
