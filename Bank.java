import java.util.Scanner; // Bank Working Example
 
class BankWork
{
    double bal=0;
    Scanner sc = new Scanner(System.in);
   BankWork()
    {
        System.out.println("Enter Initial Balance");
        bal = sc.nextDouble();        
    }
    void deposit()
    {
        double amount;
        System.out.println("Enter Amount to be Deposited");
        amount = sc.nextDouble();  
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }
    void withdraw()
    {
        double amount;
        System.out.println("Enter Amount to be Withdrawn");
        amount = sc.nextDouble();  
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance is "+bal);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
}
public class Bank 
{
    public static void main(String[] args)
    {
        BankWork bw = new BankWork();
        bw.deposit();
        bw.withdraw();       
    }
}
