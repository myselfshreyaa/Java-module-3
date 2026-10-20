class MinimumAmountException extends Exception {
    MinimumAmountException(String msg) {
        super(msg);
    }
}

class OnlineShopping {
    static void placeOrder(int amount) throws MinimumAmountException {
        if (amount < 500)
            throw new MinimumAmountException("Minimum cart value must be 500");
        System.out.println("Order placed");
    }

    public static void main(String[] args) {
        try {
            placeOrder(300);
        } catch (MinimumAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}