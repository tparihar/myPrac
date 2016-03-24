package com.me.springjdbc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.me.springjdbc.entities.Student;

@Transactional
public class StudentDao2 implements IStudentDao{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public int saveStudent(Student s) {
		Session session=getSessionFactory().getCurrentSession();
		//session.beginTransaction();
		session.save(s);
		//session.getTransaction().commit();
		return 1;
		//String query = "insert into student(name,age,gender) values(?,?,?)";
		//return jdbcTemplate.update(query,new Object[]{s.getName(),s.getAge(),String.valueOf(s.getGender())});
	}

	public List<Student> getAllStudents() {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = (List<Student>)criteria.list();  
	    return list;  
		
	}

	public Student getDetail(String id) {
		Session session = getSessionFactory().getCurrentSession();
		Student s=(Student)session.get(Student.class,new Integer(id));
	    return s;  
		
		
	}

}


