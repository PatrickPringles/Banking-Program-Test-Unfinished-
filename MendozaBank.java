package com.mycompany.mendozabank;
import java.util.Scanner;

class BankAccount
{
    private int accountNumber;
    private int balance;
    
    public BankAccount()
    {
        this.accountNumber =  accountNumber;
        this.balance = balance;
    }
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    
    
    
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    
    public int getBalance()
    {
        return this.balance;
    }
    
    public void customer()
    {
        System.out.println("Your account number is " + this.accountNumber + ".");
    }
    
    public void balance()
    {
        System.out.println("You have only P" + this.balance + "left.");
    }
}
public class MendozaBank 
{

    public static void main(String[] args) 
    {
        BankAccount customer1 = new BankAccount();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your account number: ");
        customer1.setAccountNumber(input.nextInt());
        
        System.out.println("Enter your current balance: ");
        customer1.setBalance(input.nextInt());
        
        
        //System.out.println(customer1.getAccountNumber());
        //System.out.println(customer1.getBalance());
        
        customer1.customer();
        customer1.balance();
    }
}
