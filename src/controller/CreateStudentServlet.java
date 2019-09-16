package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;

import java.util.HashMap;
import java.util.Map;

@WebServlet("/create_student")
public class CreateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Map<Integer, Student> studentMap=new HashMap<Integer, Student>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student=new Student();
		
		student.setId(Integer.parseInt(request.getParameter("id")));
		student.setName(request.getParameter("name"));
		student.setYear(Integer.parseInt(request.getParameter("year")));
		student.setGender(request.getParameter("gender"));
		
		String date=request.getParameter("date");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			student.setDate(sdf.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		studentMap.put(student.getId(), student);
	}

}
