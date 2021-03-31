/*  programe name   :   to insert multiple books record into data base with run time input using PreparedStatement
    file name       :   InsertRecord1.java
    date            :
*/

import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class InsertRecord1 {
    public static void main (String[] args) {
        try {
            // to load driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // to create connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "ankita");
            
            // to create statement object
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO book VALUES(?, ?, ?, ?, ?)");
            
            // to crate object of bufferedReader class to take run time input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String bookname, author, category, choice = "yes";
            int serialNo, edition;

            // take input from user
            do {
                System.out.print("Enter Book name - ");
                bookname = br.readLine();
                System.out.print("Enter category - ");
                category = br.readLine();
                System.out.print("Enter Serial number - ");
                serialNo = Integer.parseInt(br.readLine());
                System.out.print("Enter Edition - ");
                edition = Integer.parseInt(br.readLine());
                System.out.print("Enter author name - ");
                author = br.readLine();
               
                pstmt.setString(1, bookname);
                pstmt.setString(2, category);
                pstmt.setInt(3, serialNo);
                pstmt.setInt(4, edition);
                pstmt.setString(5, author);
    
                // execute query
                con.setAutoCommit(false);
                int rowUpdate = pstmt.executeUpdate();
                con.commit();
    
                System.out.println(rowUpdate + " Record Inserted successfully...");
    
                System.out.print("Do you want to continue?[yes/no] - ");
                choice = br.readLine();
                
                if (choice.equals("no")) {
                    break;
                }
            }while(true);

            // close connection object
            con.close();
        }
        catch(Exception exp) {
            System.out.println(exp);
        }
    }
}
