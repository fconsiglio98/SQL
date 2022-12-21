package it.develhope.sql;

import java.sql.*;
import java.util.ArrayList;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        ArrayList<String> surname = new ArrayList<String>();

        Connection conn = null;
        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/newdb";
            String user      = "developer";
            String password  = "Articolo31-";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String queryUpdateStudents = "ALTER TABLE `newdb`.`students` ADD COLUMN `country` VARCHAR(30) NOT NULL AFTER `first_name`;";
            statement.executeUpdate(queryUpdateStudents);
            System.out.println("Query Alter Table su tabella 'students' effettuata");

            /*while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                surname.add(rs.getString(2));
            }*/

            // more processing here
            // ...
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

        System.out.println(surname);
    }
}
