package it.develhope.sql;

import java.sql.*;
import java.util.ArrayList;

public class MyJDBC {
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

            //add column
            String queryUpdateStudentsTable = "ALTER TABLE `newdb`.`students` ADD COLUMN `country` VARCHAR(30) NOT NULL AFTER `first_name`;";
            statement.executeUpdate(queryUpdateStudentsTable);
            System.out.println("Query Alter Table su tabella 'students' effettuata");

            //insert country for students
            String varcountry1 = ""
                    + "UPDATE `newdb`.`students` SET `country` = 'Italy' WHERE (`students_id` = '1');";


            String varcountry11 = ""
                    + "UPDATE `newdb`.`students` SET `country` = 'Italy' WHERE (`students_id` = '2');";


            String varcountry12 = ""
                    + "UPDATE `newdb`.`students` SET `country` = 'Germany' WHERE (`students_id` = '3');";


            String varcountry13 = ""
                    + "UPDATE `newdb`.`students` SET `country` = 'Germany' WHERE (`students_id` = '4');";

            statement.executeUpdate(varcountry1);
            statement.executeUpdate(varcountry11);
            statement.executeUpdate(varcountry12);
            statement.executeUpdate(varcountry13);
            System.out.println("Query Alter Table su tabella 'students' effettuata");
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
