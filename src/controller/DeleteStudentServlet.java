package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/delete_student")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DeleteStudentServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentId = Integer.parseInt(request.getParameter("id"));
		StudentDAO.delete(studentId);
	}


}
