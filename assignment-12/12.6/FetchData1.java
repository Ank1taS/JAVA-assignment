/*  PROGRAME NAME   :   To get 1st, last, 4th, previous of 5th book from database table 
    FILE NAME       :   FetchData1.java
    Date            :
*/

import java.sql.*;

class FetchData1 {
    public static void main (String[] args) {
        try {
            // To load driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // To create connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "ankita");

            // To create statement
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            System.out.println("\n\tBOOK LISTS\n************************");

            // query
            String query = "SELECT * FROM book";

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            // to print first record
            if (rs.first()) {
                System.out.println("------FIRST RECORD------");
                System.out.printf("\n\t %-20s %-20s %-8s %-6s %-20s\n", "BOOK NAME", "CATEGORY", "SERIAL NO.", "EDITION", "AUTHOR");
                System.out.printf("\t %-20s %-20s %-10s %-4s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            else {
                System.out.println("No record is found.\nProgram end.");
                
                // close connection object
                con.close();
                return;
            }
            
            // to print last record
            if (rs.last()) {
                System.out.println("------LAST RECORD------");
                System.out.printf("\n\t %-20s %-20s %-8s %-6s %-20s\n", "BOOK NAME", "CATEGORY", "SERIAL NO.", "EDITION", "AUTHOR");
                System.out.printf("\t %-20s %-20s %-10s %-4s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            else {
                System.out.println("No record is found.\nProgram end.");
 
                // close connection object
                con.close();
                return;
            }

            // to print 4th record
            if (rs.absolute(4)) {                
                System.out.println("------4TH RECORD------");
                System.out.printf("\n\t %-20s %-20s %-8s %-6s %-20s\n", "BOOK NAME", "CATEGORY", "SERIAL NO.", "EDITION", "AUTHOR");
                System.out.printf("\t %-20s %-20s %-10s %-4s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
             
                System.out.println("------PREVIOUS OF 5TH RECORD------");
                System.out.printf("\n\t %-20s %-20s %-8s %-6s %-20s\n", "BOOK NAME", "CATEGORY", "SERIAL NO.", "EDITION", "AUTHOR");
                System.out.printf("\t %-20s %-20s %-10s %-4s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            else {
                System.out.println("No fourth record is found.\nProgram end.");
                System.out.println("No previous of 5th record is found.\nProgram end.");
 
                // close connection object
                con.close();
                return;
            }

            // close connection object
            con.close();
        }
        catch(Exception exp) {
            System.out.println(exp);
        }
    }
}