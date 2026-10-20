import java.util.Scanner;

class BankTransaction extends Thread {
    int amount;

    BankTransaction(int amount) {
        this.amount = amount;
    }

    public void run() {
        if (amount >= 50000)
            System.out.println("High-value transaction processed first");
        else
            System.out.println("Low-value transaction processed later");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Transaction1: ₹");
        int a = sc.nextInt();

        System.out.print("Transaction2: ₹");
        int b = sc.nextInt();

        BankTransaction t1 = new BankTransaction(a);
        BankTransaction t2 = new BankTransaction(b);

        if (a >= b) {
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
        } else {
            t2.setPriority(Thread.MAX_PRIORITY);
            t1.setPriority(Thread.MIN_PRIORITY);
        }

        if (a >= b) {
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            t2.start();
        } else {
            t2.start();
            try {
                t2.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            t1.start();
        }

        sc.close();
    }
}