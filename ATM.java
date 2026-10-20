import java.util.Scanner;
class ATM {
    double balance;
    ATM(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }

        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        ATM atm = new ATM(balance);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {
            atm.withdraw(amount);
        }
        catch (Exception e) {
            System.out.println("Exception : Insufficient Balance");
        }
        finally {
            System.out.println("Transaction Completed");
        }
        sc.close();
    }
}