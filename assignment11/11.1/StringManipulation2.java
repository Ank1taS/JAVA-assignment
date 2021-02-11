// programe name    :   to create a string "I love India" then manipulate it "I love my India", then replace India 
//                      by country then change to "I love my" and finaly to "I love India"
// file name        :   StringManipulation2.java
// date             :   8.2.2021

import java.io.FileWriter;
import java.lang.StringBuffer;
import java.io.IOException;

class StringManipulation2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("textFile1.txt");

            String str = "I love India\n";

            // to write in textFile1.txt
            fw.write(str);

            // manipulate str to i love my India
            StringBuffer strNew = new StringBuffer(str);
            strNew.insert(6, " my");
            str = strNew.toString();
            fw.write(str);

            // manipulate str to i love my country
            strNew = strNew.replace(10, 15, "country");
            str = strNew.toString();
            fw.write(str);

            // manipulate str to i love my 
            strNew = new StringBuffer(strNew.substring(0, 9));
            strNew = strNew.append("\n");
            str = strNew.toString();
            fw.write(str);

            // manipulate str to i love India
            strNew = new StringBuffer(strNew.substring(0, 6));
            strNew = strNew.append(" India");
            str = strNew.toString();
            fw.write(str);

            fw.flush();
            fw.close();
        }
        catch (Exception exp) {
            System.out.println(exp);
        }
    }
}
