// to create a text file and line of text  are input from console
// file name    :   ReadConsole1.java
// date         :   19/10/2020

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class ReadConsole1 {
    public static void main(String[] args) {
        try {
            int x;
            FileOutputStream fout = new FileOutputStream("Textdemo.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            while((x = System.in.read()) != -1) {
                bout.write((char)x);
            }

            bout.flush();
            fout.close();
        }
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}