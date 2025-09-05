package project;



import java.util.Scanner;

class Account {
    int Ac_No;
    String Name;
    double Balance;

    // Method to display account details
    void display() {
        System.out.println("Account Number: " + Ac_No);
        System.out.println("Account Holder Name: " + Name);
        System.out.println("Account Balance: " + Balance);
    }

    // Method to set account details
    void setdata(int ac_no, String name, double balance) {
        Ac_No = ac_no;
        Name = name;
        Balance = balance;
    }

    // Method to deposit amount
    void deposit(double amount) {
        Balance += amount;
        System.out.println("Deposit Successful. New Balance: " + Balance);
    }
}

public class BankDeposit {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int ac_no = scanner.nextInt();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.next();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        account.setdata(ac_no, name, balance);

        System.out.println("Account Details:");
        account.display();

        System.out.print("Enter Amount to Deposit: ");
        double depositAmount = scanner.nextDouble();

        account.deposit(depositAmount);
    }
}

