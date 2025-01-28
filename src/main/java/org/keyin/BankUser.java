package org.keyin;

public class BankUser {
    protected int id;
    protected String fName;
    protected String lName;
    protected double balance;

    //Constructors
    public BankUser(int id, String fName, String lName, double balance)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
    }

    //Methods
    public String getfName()
    {
        return this.fName;
    }

    public String getlName()
    {
        return this.lName;
    }

    public int getId()
    {
        return this.id;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return "Name: " + this.fName + " " +  this.lName + ", ID: " + this.id + ", Balance: " + this.balance;
    }


}
