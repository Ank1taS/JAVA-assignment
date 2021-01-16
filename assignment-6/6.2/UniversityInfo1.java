/*
    programe name   :   parent class University having properties name, Address as Agregation, noOfDepts, VCname,
                        NAACGrade, with method. class Student and Teacher inherits University. to impliment 
                        Dynamic dispatch and method overriding   
    file name       :   UniversityInfo1.java
    date            :
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Address
{
    String city;
    String state;
    String country;

    Address(String city, String state, String country)
    {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class University
{
    String name;
    Address address;
    byte noOfDept;
    String VCName;
    String NAACGrade;
    
    void display()
    {
        System.out.println("address = " + address.city + " , " + address.state + " , " + address.country);
    }
}

class Teacher extends University
{
    String nameteacher;
    int age;
    String dept;

    Teacher(String nameteacher,
            int age,
            String dept,
            String name,
            byte noOfDept,
            String VCName,
            String NAACGrade,
            String city,
            String state,
            String country)
    {
        this.nameteacher = nameteacher;
        this.age = age;
        this.dept = dept;
        this.name = name;
        this.noOfDept = noOfDept;
        this.VCName = VCName;
        this.NAACGrade = NAACGrade;
        address = new Address(city, state, country);
    }

    void display()
    {
        System.out.println("\n\nTEACHER INFO");
        System.out.println("teacher name : " + nameteacher);
        System.out.println("age = " + age);
        System.out.println("department name  = " + dept);
        System.out.println("\nUNIVERSITY INFO");
        System.out.println("name = " + name);
        System.out.println("numbers of dept = " + noOfDept);
        System.out.println("VC name = " + VCName);
        super.display();
    }
}

class Student extends University
{
    String nameStudent;
    int age;
    String dept;

    Student(String nameStudent,
            int age,
            String dept,
            String name,
            byte noOfDept,
            String VCName,
            String NAACGrade,
            String city,
            String state,
            String country)
    {
        this.nameStudent = nameStudent;
        this.age = age;
        this.dept = dept;
        this.name = name;
        this.noOfDept = noOfDept;
        this.VCName = VCName;
        this.NAACGrade = NAACGrade;
        address = new Address(city, state, country);
    }

    void display()
    {
        System.out.println("\n\nSTUDENT INFO");
        System.out.println("student name : " + nameStudent);
        System.out.println("age = " + age);
        System.out.println("department name  = " + dept);
        System.out.println("\nUNIVERSITY INFO");
        System.out.println("name = " + name);
        System.out.println("NACC Grade = " + NAACGrade);
        System.out.println("numbers of dept = " + noOfDept);
        System.out.println("VC name = " + VCName);
        super.display();
    }
}

class UniversityInfo1 
{
    public static void main(String[] args)throws IOException
    {       
        String universityName;
        String dept;
        String VCName;
        String NAACGrade;
        String city;
        String state;
        String country;
        String name;
        int age;
        byte noOfDept;          
    
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        University obj1;

        // inputs for Teacher class
        System.out.println("enter TEACHER info");
        System.out.print("name = ");
        name = buf.readLine();
        System.out.print("age = ");
        age = Integer.parseInt(buf.readLine());
        System.out.print("department = ");
        dept = buf.readLine();
        System.out.print("University name = ");
        universityName = buf.readLine();
        System.out.print("nos Of Deptments = ");
        noOfDept = Byte.parseByte(buf.readLine());
        System.out.print("VC Name = ");
        VCName = buf.readLine();
        System.out.print("NAACGrade = ");
        NAACGrade = buf.readLine();
        System.out.print("city = ");
        city = buf.readLine();
        System.out.print("state = ");
        state = buf.readLine();
        System.out.print("country = ");
        country = buf.readLine();

        // teacher class object Instantioation
        obj1 = new Teacher(name, age, dept, universityName, noOfDept, VCName, NAACGrade, city, state, country);
        obj1.display();
        System.out.println("\n");

        // input for Student class
        System.out.println("\nenter STUDENT info");
        System.out.print("name = ");
        name = buf.readLine();
        System.out.print("age = ");
        age = Integer.parseInt(buf.readLine());
        System.out.print("department = ");
        dept = buf.readLine();
        System.out.print("University name = ");
        universityName = buf.readLine();
        System.out.print("nos Of Deptments = ");
        noOfDept = Byte.parseByte(buf.readLine());
        System.out.print("VC Name = ");
        VCName = buf.readLine();
        System.out.print("NAACGrade = ");
        NAACGrade = buf.readLine();
        System.out.print("city = ");
        city = buf.readLine();
        System.out.print("state = ");
        state = buf.readLine();
        System.out.print("country = ");
        country = buf.readLine();
        
        //Student class object Instantioation
        obj1 = new Student(name, age, dept, universityName, noOfDept, VCName, NAACGrade, city, state, country);
        obj1.display();
    }
}
