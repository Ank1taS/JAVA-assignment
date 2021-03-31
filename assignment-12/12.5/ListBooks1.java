/*  PROGRAME NAME   :   To list all the book records using preparedStatement
    FILE NAME       :   ListBook1.java
    DATe            :
*/

import java.sql.*;

class ListBooks1 {
    public static void main (String[] args) {
        try {
            // To load driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // To create connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "ankita");

            // To create preparedStatement object
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM book");

            System.out.println("\n\tBOOK LISTS\n************************");

            // Execute query
            ResultSet rs = pstmt.executeQuery();

            System.out.printf("\n\t %-20s %-20s %-8s %-6s %-20s\n", "BOOK NAME", "CATEGORY", "SERIAL NO.", "EDITION", "AUTHOR");

            // To print the lists
            while (rs.next()) {
                System.out.printf("\t %-20s %-20s %-10s %-4s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }

            // close connection object
            con.close();
        }

        catch(Exception exp) {
            System.out.println(exp);
        }
    }
}