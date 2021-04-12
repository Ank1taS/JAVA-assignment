/*
    programe name   :   to read 3rd text line of file and display
                        that line of text in order and in reverse order
    file name       :   ReverseLine1.java
    date            :   21/10/2020
*/

import java.io.*;

public class ReverseLine1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("textFile.txt");
            BufferedReader buf = new BufferedReader(new InputStreamReader(fin));

            String line = buf.readLine();
            int countLine = 1;
            boolean check = false;

            while (line != null) {
                
                if (countLine == 3) {
                    check = true;
                    break;
                }
                
                line = buf.readLine();
                countLine++;
            }

            if (check == true) {
                
                StringBuffer sb = new StringBuffer(line);
                System.out.println("Original - " + line + "\nReversed - " + sb.reverse());
            }

            else {
                System.out.println("There is no 3rd line in the file.");
            }

            fin.close();
        }
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}