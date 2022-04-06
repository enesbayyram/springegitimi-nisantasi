package com.jforce.tr.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.jforce.tr.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	private Map<Integer, Student> studentMap = new HashMap<>();
	
	//Spring containerda bu classtan nesne oluşurken ilk çağrılmasını istediğim metod.
	@PostConstruct
	public void doldur() {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Derya");
		student1.setLastName("Bektaş");
		//---------------------------------
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Adem");
		student2.setLastName("Güngen");
		//---------------------------------
		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("Serhat");
		student3.setLastName("Yurdan");
		//---------------------------------
		Student student4 = new Student();
		student4.setId(4);
		student4.setFirstName("Ayşenur");
		student4.setLastName("Aydoğdu");
		//--------------------------------
		Student student5 = new Student();
		student5.setId(5);
		student5.setFirstName("Mert");
		student5.setLastName("Yiğit");
		
		//Koleksiyona öğrencileri ekledim.
		studentMap.put(student1.getId(), student1);
		studentMap.put(student2.getId(), student2);
		studentMap.put(student3.getId(), student3);
		studentMap.put(student4.getId(), student4);
		studentMap.put(student5.getId(), student5);
		
	}

	@Override
	public List<Student> getStudentList() {
		return new ArrayList<>(studentMap.values());
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentMap.get(id);
	}

	@Override
	public void add(Student student) {
		studentMap.put(student.getId(), student);
		System.out.println("Öğrenci eklendi...");
		
	}

	@Override
	public void update(Student student) {
		studentMap.replace(student.getId(), student);
		System.out.println("Öğrenci güncellendi...");
	}

	@Override
	public void delete(Integer id) {
		studentMap.remove(id);
		System.out.println("Öğrenci silindi...");
	}
	
}
