import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Statement;

public class Servlet2 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection conn = (connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/bcs" );
            String demo ="INSERT INTO walim(Name,Grade,Email)VALUES('+Name+','+Grade+','+Email+')";
            Statement stm = conn.createStatemnt();
            stm.executeUpdate(demo);
            String Name = request.getParameter(name "name");
            String Grade = request.getParameter(name "grade");
            String Email = request.getParameter(name "email");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
