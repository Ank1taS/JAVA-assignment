/*
    programe name   :   to read a text file line by line and display
                        line of text and line number (using buffered reader)
    file name       :   PrintLine1.java
    date            :   21/10/2020
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

class PrintLine2
{
    public static void main(String[] args)
    {
        try{
            FileReader fin = new FileReader("Textdemo.txt");
            BufferedReader bufIn = new BufferedReader(fin);

            int lineNo = 1;
            String line;

            while((line = bufIn.readLine()) != null)
            {
                System.out.println(lineNo + "  -  " + line);
                lineNo += 1;
            }

            fin.close();
            bufIn.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

