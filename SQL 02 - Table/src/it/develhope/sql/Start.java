package it.develhope.sql;

import java.sql.*;

public class Start {
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/newdb";
            String user      = "developer";
            String password  = "Articolo31-";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();

            //create table
            String queryCreate = ""
                    + "CREATE TABLE IF NOT EXISTS students "
                    + "                ( students_id INTEGER(10) NOT NULL AUTO_INCREMENT, "
                    + "                  last_name VARCHAR(30), "
                    + "                  first_name VARCHAR(30), "
                    + "                  CONSTRAINT students_pk PRIMARY KEY (students_id) "
                    + "                );";

            statement.executeUpdate(queryCreate);
            System.out.println("Query eseguita correttamente: creata tabella 'students'");
            statement.close();

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
