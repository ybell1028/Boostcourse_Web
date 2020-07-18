package projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aboutme/today")
public class Today extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Today() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd a h:m");
		String nowString = now.format(formatter);
		out.println("<html>");
		out.println("<head>");
		out.println("<title>form</title>");
		out.println("</head>");
		out.println("<meta name=\"viewport\" content=\"width=device-width\">");
		out.println("<body>");
		out.println("<div><a href=\"http://localhost:8080/boostcourse/index.html\">메인화면</a></div>");
		out.println("<div>현재시간 : " + nowString + "</div>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
