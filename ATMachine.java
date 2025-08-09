import java.util.*;
class ATM{
    
    float Balance;
    int PIN=7830;
      
    public void checkpin()
    {
        System.out.println("Enter Your PIN: ");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt(); //pin entered by user
        if(pin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Invalid PIN! \nEnter a valid PIN.\n");
            menu();
        }
    }
    public void menu()
    {
        System.out.println("Enter Your Choice:");
        System.out.println("1.Check Balance.");
        System.out.println("2.Withdraw Money.");
        System.out.println("3.Deposit Money.");
        System.out.println("4.EXIT. \n");
        
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        
        if(option==1)
        {
            checkBalance();
        }
        else if(option==2)
        {
            withdrawMoney();
        }
        else if(option==3)
        {
            depositMoney();
        }
        else if(option==4)
        {
          return;  
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance()
    {
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawMoney()
    {   
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance)
        {
            System.out.println("Insufficient Balance.");
        }
        else{
            Balance= Balance-amount;
            System.out.println("Money Withdrawl Successful\n");
        }
        menu();
    }
    public void depositMoney()
    {
        System.out.println("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance= Balance + amount;
        System.out.println("Money Deposited Successfully\n");
        menu();
    }
    }
public class ATMachine{
    public static void main(String[] args){
        ATM obj=new ATM(); //object creation
        obj.checkpin();  
        
    }
}

    
