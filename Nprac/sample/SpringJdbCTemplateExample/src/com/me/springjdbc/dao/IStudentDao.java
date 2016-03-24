package com.me.springjdbc.dao;

import java.util.List;

import com.me.springjdbc.entities.Student;

public interface IStudentDao {
	public int saveStudent(Student s);
	public List<Student> getAllStudents();
	public Student getDetail(String id);
}
