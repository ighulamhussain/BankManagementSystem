import java.util.ArrayList;
import java.util.Scanner;

public class Banking {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String AccountNumber;
    private final BankAccount bankAcc;
    ArrayList<Banking> listOfCustomers =new ArrayList<>();
    Banking() {
        bankAcc = new BankAccount();
        for(int i =0 ; i < listOfCustomers.size();i++){
            Banking temp =  new Banking();
            temp.setBalance(balance);
            temp.setPreviousTransaction(previousTransaction);
            temp.setAccountNumber(AccountNumber);
            temp.setCustomerName(customerName);
            listOfCustomers.add(temp);
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    void showMenu()
    {
        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello "+this.getCustomerName()+". Welcome to Bank");
        System.out.println("Your AccountNumber is "+this.getAccountNumber());
        System.out.println();
        System.out.println("A) Check Account Balance");
        System.out.println("B) Deposit Amount");
        System.out.println("C) Withdraw Amount");
        System.out.println("D) Check Previous Transaction");
        System.out.println("E) Exit");
        System.out.println();

        do
        {
            System.out.println("#################################################################################################");
            System.out.println("Enter Your Option");
            System.out.println("#################################################################################################");
            option=sc.next().charAt(0);
            System.out.println();
            switch(option)
            {

                case 'A':
                    System.out.println();
                    System.out.println("Your Account Balance is "+this.getBalance());
                    System.out.println();
                    break;

                case 'B':
                    System.out.println();
                    System.out.println("Enter the Amount to be deposited: ");
                    System.out.println();
                    int amount=sc.nextInt();
                    bankAcc.deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println();
                    System.out.println("Enter the Amount to be Withdrawn: ");
                    System.out.println();
                    int withdrawnAmount=sc.nextInt();
                    bankAcc.withDraw(withdrawnAmount);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println();
                    System.out.println("Your Previous Transaction is "+previousTransaction);
                    bankAcc.getPreviousTransaction();
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("Thankyou for your transaction. Rate our Service");
                    bankAcc.ServiceRating();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option !!! Please try again ");
                    break;
            }
        }
        while(option!='E');
    }
    private class BankAccount{
        Scanner sc=  new Scanner(System.in);
        void deposit(int amount)
        {
            if(amount!=0)
            {
                balance+=amount;
                previousTransaction=amount;
            }
        }
        void withDraw(int amount)
        {
            if(amount!=0)
            {
                balance-=amount;
                previousTransaction = -amount;
            }
        }
        void getPreviousTransaction()
        {
            if(previousTransaction > 0)
                System.out.println("Deposited Amount is: "+previousTransaction);
            if(previousTransaction < 0)
                System.out.println("Withdrawn amount is: "+Math.abs(previousTransaction));
            else
                System.out.println("Thankyou for you valuable time :)");
        }
        void ServiceRating()
        {
            char feedback;
            System.out.println("Give your Ratings Below ");
            System.out.println("1) Awsome");
            System.out.println("2) VeryGood");
            System.out.println("3) Good");
            System.out.println("4) Satisfied");
            System.out.println("5) Poor");
            System.out.println();
            System.out.println("Enter your Rating:");
            feedback=sc.next().charAt(0);
            System.out.println();
            if(feedback=='1'||feedback=='2'||feedback=='3')
                System.out.println("Thankyou "+customerName+" for your valuable feedback :) ");
            else if(feedback=='4'||feedback=='5')
                System.out.println("We will improve our service much better. Thankyou :) ");
            else
                System.out.println(" * Thankyou for Your Valuable Time * ");

        }
    }
}
