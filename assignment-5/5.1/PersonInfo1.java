// programe to create a class named person with different properties
// file name    : PersonalInfo1.java
// date         : 21/09/2020

import java.util.Scanner;

class Person
{
    String id;
    String name;
    char gender;
    String bloodGrp;
    String nationality;

    Person(String a, String b, char c, String d, String e)
    {
        id = a;
        name = b;
        gender = c;
        bloodGrp = d;
        nationality = e;
    }

    void show()
    {
        System.out.println("  DISPLAY  ");
        System.out.println("Name = " + name);
        System.out.println("Id = " + id);
        System.out.println("Gender = " + gender);
        System.out.println("Blood group = " + bloodGrp);
        System.out.println("Nationality = " + nationality);
    }
}

class PersonInfo1
{
    public static void main(String args[])
    {   
        Scanner input = new Scanner(System.in);
        String id;
        String name;
        char gender;
        String bloodGrp;
        String nationality;
        
        System.out.print("Name = ");
        name = input.nextLine();
        System.out.print("Id = ");
        id = input.nextLine();
        System.out.print("Gender = ");
        gender = input.next().charAt(0);
        input.nextLine();
        System.out.print("Blood group = ");
        bloodGrp = input.nextLine();
        System.out.print("Nationality = ");
        nationality = input.nextLine();

        Person obj = new Person(id, name, gender, bloodGrp, nationality);
        obj.show();

        input.close();
    }
}
