/*  programe    :   To list files of a directory with size in kb
    file name   :   ListFile.java
    date        :
*/

import java.io.*;

public class ListFile {
    public static void main(String[] args) {
        File dir = new File("C:/MY-PROGRAME/3rd semester/java/test programe");

        if (!dir.isDirectory()) {
            System.out.println("Directory did not exist");
            return;
        }

        File files[] = dir.listFiles();
        int fileCount = 0, dirCount = 0;

        for (File file : files) {   
            if (file.isDirectory()) {
                System.out.println(file.getName() + " is a Directory .");
                ++dirCount;
            }

            else {
                System.out.println("File Name: " + file.getName());
                System.out.println("Size: " + (double)file.length() / 1024 + " kb\n");
                ++fileCount;
            }
        }

        System.out.println("\nTotal Files: " + fileCount + "\nTotal directory: " + dirCount);
    }
}
