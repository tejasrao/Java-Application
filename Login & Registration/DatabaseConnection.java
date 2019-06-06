package LoginAndRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    /*
    * This a method used to Establish connection between java and mysql
    * @returns the connection(object).
    * @exception ClassNotFoundException If the jdbc driver class doesn't exist
    * @exception SQLException On connection errors Eg. Invalid url/username/password or server is not running etc 
    */
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/logincredentials?useSSL=false", "admin", "Admin@123456789");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
}
