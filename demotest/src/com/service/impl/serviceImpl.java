package com.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;
import com.service.StudentService;
@Service
public class serviceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Transactional
	public void add(Student student) {

		studentDao.add(student);
	}

	@Transactional
	public void edit(Student student) {

		studentDao.edit(student);
	}

	@Transactional
	public void delete(int studentId) {

		studentDao.delete(studentId);
	}

	@Transactional
	public Student getStudent(int studentId) {

		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List<Student> getAllStudent() {

		return studentDao.getAllStudent();
	}

}
