package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import model.StudentDAO;


@WebServlet("/edit_student")
public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public EditStudentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = StudentDAO.get(studentId);
		request.setAttribute("student", student);
		
		String editPage="student_form.jsp";
		RequestDispatcher requestDispatcher=request.getRequestDispatcher(editPage);
		requestDispatcher.forward(request, response);
	}
}
