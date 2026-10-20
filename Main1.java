class PrinterJob implements Runnable {
    String student;
    int job;

    PrinterJob(String s, int j) {
        student = s;
        job = j;
    }

    public void run() {
        System.out.println("Printing job " + job + " by " + student);
    }
}

public class Main1{
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterJob("Student A", 1));
        Thread t2 = new Thread(new PrinterJob("Student B", 2));
        Thread t3 = new Thread(new PrinterJob("Student C", 3));

        t1.start();
        t2.start();
        t3.start();
    }
}