import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AnswerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String url=request.getParameter("url");
        String ans=request.getParameter("text");
        HttpSession nsession = request.getSession(false);
        if(nsession!=null) {
        String username=(String) nsession.getAttribute("Username");
        try
           {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/quora?useSSL=false","root","shivangi**");
                String sql_query="insert into Answer values(?,?)";
                PreparedStatement pstmt=conn.prepareStatement(sql_query);
                pstmt.setString(1,url);
                pstmt.setString(2,ans);
                pstmt.executeUpdate();
                nsession.setAttribute("Username",username);
                RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
                rd.forward(request, response);
           }
            catch(SQLIntegrityConstraintViolationException e)
           {
               out.println("<html><body>");
               out.println("<script type=\"text/javascript\">");
               out.println("window.alert(\"Please try with some new answers.Same answer has already been posted!\")");
               out.println("window.location.href=\"dashboard.jsp\"");
               out.println("</script>");
               out.println("</body></html>");
               //response.sendRedirect("index.html");
           }
           catch(Exception e)
           {
               out.println(e);
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
