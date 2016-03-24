package com.me.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.me.springjdbc.entities.Student;

public class StudentDao implements IStudentDao{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student s) {
		String query = "insert into student(name,age,gender) values(?,?,?)";
		
		return jdbcTemplate.update(query,new Object[]{s.getName(),s.getAge(),String.valueOf(s.getGender())});
	}

	public List<Student> getAllStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}

	public Student getDetail(String id) {
		String SQL = "select * from Student where id='"+id+"'";
		Student students = (Student)jdbcTemplate.query(SQL, new StudentMapper());
		return students;
		
	}

}

class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setGender(rs.getString("gender").charAt(0));
		return student;

	}
}
