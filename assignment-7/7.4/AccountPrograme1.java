/* 
PROGRAME NAME   :   To create an abstract class "Account" with members and abstract methods . Objects of Subclasses 
                    "SavingAccount" and "CurrentAccount" get their information through abstract methods.
FILE NAME       :   AccountPrograme1.java

*/

import java.util.Scanner;

abstract class Account {
    float  balance;
    float  min_balance;
    String acc_type;
    String acc_holder_name;
    String mobile_no;

    abstract void getBalance();
    abstract void getMobileNo();
    abstract void getAccHolderName();
    abstract void display();
}

class SavingAcc extends Account {
    SavingAcc() {
        acc_type = "SAVINGS ACCOUNT";
        min_balance = (float)1000;
    }

    void getBalance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Balance:");
        balance = sc.nextFloat();
    }

    void getMobileNo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mobile Number:");
        mobile_no = sc.nextLine();
    }

    void getAccHolderName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:");
        acc_holder_name = sc.nextLine();
    }

    void display() {
        System.out.println("Acc. Type = " + acc_type);
        System.out.println("Acc. Name = " + acc_holder_name);
        System.out.println("Current Balance = " + balance);
        System.out.println("Mobile Number = " + mobile_no);
    }
}

class CurrentAcc extends Account {
    CurrentAcc() {
        acc_type = "CURRENT ACCOUNT";
        min_balance = (float)1000;
    }
    void getBalance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Balance:");
        balance = sc.nextFloat();
    }

    void getMobileNo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mobile Number:");
        mobile_no = sc.nextLine();
    }

    void getAccHolderName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:");
        acc_holder_name = sc.nextLine();
    }

    void display() {
        System.out.println("Acc. Type = " + acc_type);
        System.out.println("Acc. Name = " + acc_holder_name);
        System.out.println("Current Balance = " + balance);
        System.out.println("Mobile Number = " + mobile_no);
    }
}

class AccountPrograme1 {
    public static void main(String[] args) {
        System.out.println("---SAVINNGS ACCOUNT---");
        
        Account obj = new SavingAcc();
        obj.getAccHolderName();
        obj.getBalance();
        obj.getMobileNo();

        System.out.println("---DISPLAY---");
        obj.display();

        System.out.println("---CURRENT ACCOUNT---");

        obj = new CurrentAcc();
        obj.getAccHolderName();
        obj.getBalance();
        obj.getMobileNo();

        System.out.println("---DISPLAY---");
        obj.display();
    }
}
