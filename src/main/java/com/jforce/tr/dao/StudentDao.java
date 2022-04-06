package com.jforce.tr.dao;

import java.util.List;

import com.jforce.tr.model.Student;

public interface StudentDao {

	public List<Student> getStudentList();
	
	public Student getStudentById(Integer id);
	
	public void add(Student student);
	
	public void update(Student student);
	
	public void delete(Integer id);
}
