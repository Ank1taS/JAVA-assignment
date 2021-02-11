/*
    programe name   :   to read a text file line by line and display
                        line of text and line number
    file name       :   printLine1.java
    date            :   21/10/2020
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class PrintLine1 {
    public static void main(String[] args) throws IOException {
        int lineNo = 1;
            File file = new File("Textdemo.txt");
            Scanner sc = new Scanner(file);
            
            while(sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(lineNo + "  -  " + line);
                lineNo += 1;
            }

            sc.close();
    }
}

