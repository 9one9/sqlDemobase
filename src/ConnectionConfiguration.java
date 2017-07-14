/**
 * Created by Rayson on 7/6/17.
 */
import com.mysql.jdbc.ResultSetRow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionConfiguration {


    public static Connection getConnection() {
        Connection connection = null;
        ResultSet rs = null;
        
        Statement q = null;
        Statement stmt = null;

        String someQuery = "SELECT * FROM Park.MOCK_DATA";


        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Park?:3306/",
                                                        "NOTroot",
                                                            "");

            stmt = connection.createStatement();
            rs = q.executeQuery(someQuery);


            // Why does ResultSet give a null pointer even if the string was stated?

            System.out.println("<--Executed-->");

        } catch(Exception ex) {
            ex.printStackTrace();

            System.err.println("Got an exception! ");

            if (q == null){System.out.println("Querynull");}

            // find a way to throw regular sql exceptions
        }
        return connection;
    }
    //connection = DriverManager.getConnection("jdbc:mysql://longbeach.ctaje27sy3yo.us-east-1.rds.amazonaws.com:3307/Brookbase","root","");
    //On AWS the port follows the Endpoint URL
    //jdbc:mysql://localhost/test?" "user=minty&password=greatsqldb
}

