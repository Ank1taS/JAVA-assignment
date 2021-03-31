/*  programe name   :   to insert 1 book record into data base with run time input
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

            // to crate object of bufferedReader class to take run time input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String bookname, author, category;
            int serialNo, edition;

            // take input from user
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
           
            // to create statement object
            Statement stmt = con.createStatement();

            // execute query
            String sqlCmd = "INSERT INTO book VALUES ('"+bookname+"', '"+category+"', '"+serialNo+"', '"+edition+"', '"+author+"')";
            con.setAutoCommit(false);
            int rowUpdate = stmt.executeUpdate(sqlCmd);
            con.commit();

            System.out.println(rowUpdate + " Record Inserted successfully...");

            // close connection object
            con.close();
        }
        catch(Exception exp) {
            System.out.println(exp);
        }
    }
}
