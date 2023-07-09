import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
     /**
     * Connect to a sample database
     */
    public static void connect(){
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Wallace/Documents/Git Java/Java SQLite/sqlite/db/test.db";
            // create a connection to the database
            try{
            	Class.forName("org.sqlite.JDBC");
            }

            catch(ClassNotFoundException e){
            	e.printStackTrace();
            }

            finally{
            	conn = DriverManager.getConnection(url);
            	System.out.println("Connection to SQLite has been established.");
            }
            
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }

            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        connect();
    }
}