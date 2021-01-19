/*
    programe name   :   To create an abstract class "Bank" having abstract methods like getRateOfInterest() and
                        getBalance() and subclasses like SBI, PNB, BOI, IOB, UCO to find rate of interest and balance
    file name       :   BankAccount1.java
    date            :
*/

abstract class Bank
{
    abstract float getRateOfInterest();
    abstract float getBalance();
}

class SBI extends Bank
{
    float getRateOfInterest()
    {
        return 8.2f ;
    }

    float getBalance()
    {
        return 45000.765f ;
    }
}

class PNB extends Bank
{
    float getRateOfInterest()
    {
        return 5.5f ;
    }

    float getBalance()
    {
        return 50000.606f;
    }
}

class BOI extends Bank
{
    float getRateOfInterest()
    {
        return 7.5f;
    }

    float getBalance()
    {
        return 30454.675f;
    }
}

class IOB extends Bank
{
    float getRateOfInterest()
    {
        return 12f;
    }

    float getBalance()
    {
        return 45679.09f;
    }
}

class UCO extends Bank
{
    float getRateOfInterest()
    {
        return 8.5f;
    }

    float getBalance()
    {
        return 23456.987f;
    }
}

class BankAccount1
{
    public static void main(String[] args)
    {
        Bank obj;

        obj = new SBI();
        System.out.println(" SBI \n Balance = " + obj.getBalance() 
        + "\n rate Of Interest = " +  obj.getRateOfInterest() + "\n\n");

        obj = new PNB();
        System.out.println(" PNB \n Balance = " + obj.getBalance() 
        + "\n rate Of Interest = " +  obj.getRateOfInterest() + "\n\n");

        obj = new BOI();
        System.out.println(" BOI \n Balance = " + obj.getBalance() 
        + "\n rate Of Interest = " +  obj.getRateOfInterest() + "\n\n");

        obj = new IOB();
        System.out.println(" IOB \n Balance = " + obj.getBalance() 
        + "\n rate Of Interest = " +  obj.getRateOfInterest() + "\n\n");

        obj = new UCO();
        System.out.println(" UCO \n Balance = " + obj.getBalance() 
        + "\n rate Of Interest = " +  obj.getRateOfInterest() + "\n\n");
    }
}
