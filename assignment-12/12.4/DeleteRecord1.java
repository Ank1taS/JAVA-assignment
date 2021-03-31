/*  programe name   :   To delete sp. book based on serial 
                        with run time input using PreparedStatement
    file name       :   DeleteRecord1.java
    date            :
*/

import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class DeleteRecord1 {
    public static void main (String[] args) {
        try {
            // to load driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // to create connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "ankita");
            
            // to create statement object
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM book WHERE serialno = ?");
            
            // to crate object of bufferedReader class to take run time input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String choice = "yes";
            int serialNo;

            // take input from user
            do {
                System.out.print("Enter serial number - ");
                serialNo = Integer.parseInt(br.readLine());
               
                pstmt.setInt(1, serialNo);
    
                // execute query
                con.setAutoCommit(false);
                int rowUpdate = pstmt.executeUpdate();
                con.commit();
    
                System.out.println(rowUpdate + " Record Deleted successfully...");
    
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
