/*  PROGRAME NAME   :   To list all the book records belongs to a specific category using preparedStatement
    FILE NAME       :   ListBook1.java
    DATe            :
*/

import java.sql.*;
import java.util.Scanner;

class ListBooks1 {
    public static void main (String[] args) {
        try {
            // To load driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // To create connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "ankita");

            // To create preparedStatement object
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM book WHERE category = ?");

            // to get category from user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter category = ");
            String category = sc.nextLine();            

            // assigning category tp preparedStatement Query
            pstmt.setString(1, category);

            // Execute query
            ResultSet rs = pstmt.executeQuery();
            
            System.out.println("\n\tBOOK LISTS\n************************");
            System.out.printf("\n\t %-20s %-20s %-8s %-6s %-20s\n", "BOOK NAME", "CATEGORY", "SERIAL NO.", "EDITION", "AUTHOR");

            // To print the lists
            while (rs.next()) {
                System.out.printf("\t %-20s %-20s %-10s %-4s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }

            // close connection object
            con.close();
            sc.close();
        }

        catch(Exception exp) {
            System.out.println(exp);
        }
    }
}