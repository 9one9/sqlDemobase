/**
 * Created by Rayson on 7/6/17.
 */
import java.sql.Connection;
import java.sql.SQLException;

public class DBconnect {


        public static void main(String[] args){
            Connection connection = null;

            try{
                connection = ConnectionConfiguration.getConnection();
                if (connection != null) {
                    System.out.println("<--Connected-->");

                }

            } catch(Exception e) {
                e.printStackTrace();

            } finally{
                if (connection != null) {
                    try {
                        connection.close();

                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }

        }


}
