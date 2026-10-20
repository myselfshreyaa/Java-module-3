class TicketBooking {
    int availableSeats = 2;

    synchronized void bookSeat(int seats) {
        if (availableSeats >= seats) {
            availableSeats -= seats;
            System.out.println(Thread.currentThread().getName()
                + " booked " + seats + " seat(s) successfully");
        } else {
            System.out.println(Thread.currentThread().getName()
                + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    TicketBooking t;

    User1(TicketBooking t) {
        this.t = t;
    }

    public void run() {
        t.bookSeat(1);
    }
}

class User2 extends Thread {
    TicketBooking t;

    User2(TicketBooking t) {
        this.t = t;
    }

    public void run() {
        t.bookSeat(2);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBooking t = new TicketBooking();

        User1 u1 = new User1(t);
        User2 u2 = new User2(t);

        u1.setName("User1");
        u2.setName("User2");

        u1.start();
        try {
            u1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        u2.start();
    }
}