package model;

import java.util.HashMap;
import java.util.Map;

import entity.Student;

public class StudentDAO {
	Map<Integer, Student> studentList = new HashMap<Integer, Student>();

	public Student create(Student student) {
		if (studentList.containsKey(student.getId())) {

		}
		return student;
	}

	public Student update(Student student) {

		return student;
	}

	public void delete(Student student) {
		studentList.remove(student);
	}


}
