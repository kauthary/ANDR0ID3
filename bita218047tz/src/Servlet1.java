import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Servlet1 extends javax.servlet.http.HttpServlet {
    protected <connection> void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection conn = (connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/bcs" );
                String demo ="INSERT INTO walim(username,password,date)VALUES('+Name+','+RegistrationNumber+','+Grade+','+PhoneNumber+','+Email+')";
Statement stm = conn.createStatemnt();
             stm.executeUpdate(demo);
             String Name = request.getParameter(name "name");
            String RegistrationNumber = request.getParameter(name "regno");
            String Grade = request.getParameter(name "grade");
            String PhoneNumber = request.getParameter(name "phoneno");
            String Email = request.getParameter(name "email");

        protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
} catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
