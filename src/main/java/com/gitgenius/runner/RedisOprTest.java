package com.gitgenius.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gitgenius.dao.IStudentDao;
import com.gitgenius.model.Student;

@Component
public class RedisOprTest implements CommandLineRunner {
    
	@Autowired
	private IStudentDao dao;
	@Override
	public void run(String... args) throws Exception {
      dao.addStudent(new Student(101, "SAM", 500.23));
      dao.addStudent(new Student(102, "RAM", 400.23));
      dao.addStudent(new Student(103, "SATYA", 300.23));
      
      System.out.println("---------All Students--------");
      dao.getAllStudent().forEach((k,v)->System.out.println(k+"--------"+v));
      
      System.out.println("---------After Remove/Modify students--------");
      dao.removeStudent(101);
      dao.modifyStudent(new Student(102, "SAM SETU", 500.23));
      dao.getAllStudent().forEach((k,v)->System.out.println(k+"--------"+v));
	}

}
