package lab.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BusList
 */
public class BusList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusList() {
        super();
        // TODO Auto-generated constructor stub
    } 
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> 
    methods. 
    response) 
    * 
    * @param request servlet request 
    * @param response servlet response 
    * @throws ServletException if a servlet-specific error occurs 
    * @throws IOException if an I/O error occurs 
    */ 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)     
    	    throws ServletException, IOException {
    // Задание типа кодировки для параметров запроса 
    request.setCharacterEncoding("utf-8"); 
    // Чтение параметра name из запроса 
    String name = request.getParameter("name"); 
    // Задание типа содержимого для ответа (в том числе кодировки) 
    response.setContentType("text/html;charset=UTF-8"); 
    // Получение потока для вывода ответа 
    PrintWriter out = response.getWriter(); 
            try { 
                // Создание HTML-страницы 
                out.println("<html>"); 
                out.println("<head><title>Список автобусов</title></head>"); 
                out.println("<body>"); 
                out.println("<h1>Список автобусов водителя " + (name != null ? name : "без имени") + "</h1>"); 
                out.println("<table border='1'>"); 
                out.println("<tr><td><b>Автобус</b></td><td><b>Водитель</b></td><td><b>Работал</b></td></tr>"); 
                out.println("<tr><td>123</td><td>Иван Иванович</td><td>Да</td></tr>"); 
                out.println("<tr><td>321</td><td>Олег Иванович</td><td>Нет</td></tr>"); 
                out.println("</table>"); 
                out.println("</body>"); 
                out.println("</html>"); 
            } finally { 
             // Закрытие потока вывода 
                out.close(); 
            } 
        } 
    
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
