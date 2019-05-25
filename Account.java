//I have addaed this code in the git hub
package seven;
import java.lang.*;
import java.util.*;
class LessBalanceException extends Exception
{
    public LessBalanceException(int w)
    {
        System.out.println("Withdraw amount "+w+" is not valid.");
    }
}
class Account
{
    int MinimumBalance;
    private int Balance;
    public Account(int b)
    {
        Balance=b;
        MinimumBalance=500;
    }
    public void Deposit(int d)
    {
        Balance+=d;
    }
    public void Withdraw(int w) throws LessBalanceException
    { 
        if(Balance-w<500)
        {
            throw new LessBalanceException(w);
        }
        else
        {
        	Balance=Balance-w;
        }
    }
    public void display()
    {
        System.out.println("Current balance is "+Balance+".");
    }
}
public class Account2 
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the current Balance:");
        Account acc1= new Account(sc.nextInt());
        System.out.println("Enter the Deposit amount:");
        acc1.Deposit(sc.nextInt());
        try
        {
        	System.out.println("Enter the Withdrawal amount:");
            acc1.Withdraw(sc.nextInt());
        }
        catch( LessBalanceException e)
        {
            
        }
        acc1.display();
        System.out.println("\nEnter the current Balance:");
        Account acc2= new Account(sc.nextInt());
        System.out.println("Enter the Deposit amount:");
        acc2.Deposit(sc.nextInt());
        try
        {
        	System.out.println("Enter the Withdrawal amount:");
            acc2.Withdraw(sc.nextInt());
        }
        catch( LessBalanceException e)
        {
            
        }
         acc2.display();
    }
}
