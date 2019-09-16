package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import entity.Student;

public class StudentDAO {
	static Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
	static Iterator<Integer> iterator = studentMap.keySet().iterator();
	public Student create(Student student) {
		if (studentMap.containsKey(student.getId())) {

		}
		return student;
	}

	public Student update(Student student) {

		return student;
	}

	public static void delete(int studentId) {
		studentMap.remove(studentId);
	}

	public static Student get(int studentId) {
		for(Integer id : studentMap.keySet()) {
			if(id==studentId)
				return studentMap.get(id);
		}
		return null;
	}
	

}
