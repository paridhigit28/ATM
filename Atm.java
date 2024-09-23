package javaDSA;
import array.Account;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
//parent class
public class Atm {
    Scanner kb=new Scanner(System.in);
    public double balance;
    public double amt;
    public Atm(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amt) {
        System.out.println("enter the amount you want to withdraw:");
        amt=kb.nextInt();
        if(amt>0){
            if(amt<=balance) {
                balance = balance - amt;
                System.out.println("after withdrawing money your balance:" + balance);
            }
            else{
                System.out.println("insufficient balance");
            }
        }
        else {
            System.out.println("withdrawal amount must be positive");
        }
    }
    public void deposit(double amt) {
        System.out.println("enter the amount you want to deposit:");
        amt=kb.nextInt();
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("after depositing money your balance:" + balance);
        }
        else{
            System.out.println("deposit amount must be positive.");
        }
    }
    public void checkBalance() {
        System.out.println("your balance is:"+balance);
    }
}

//child class
    class BankAccount extends Atm {
//        Scanner kb=new Scanner(System.in);
        public BankAccount(double balance) {
            super(balance);
        }
        public void DisplayMenu(){
            int option;
            do {
                System.out.println("WELCOME");
                System.out.println("1. check balance");
                System.out.println("2. deposit");
                System.out.println("3. withdraw");
                System.out.println("4. exit");
                System.out.println("select an option");
                option=kb.nextInt();

                switch (option){
                    case 1:
                        super.checkBalance();
                        break;
                    case 2:
                        super.deposit(amt);
                        break;
                    case 3:
                        super.withdraw(amt);
                        break;
                    case 4:
                        System.out.println("THANKYOU");
                        break;
                    default:
                        System.out.println("invalid options!try again!");
                }
            }
            while(option!=4);
        }
    }


//driver class
    class useAtm {
        public static void main(String[] args) {

//            Atm a1 = new Atm(5000);
//            a1.DisplayMenu();
              BankAccount account=new BankAccount(720);
              account.DisplayMenu();

        }
    }

