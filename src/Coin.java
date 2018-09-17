public class Coin {
    private final double PENNY = 1;
    private final double NICKEL = 5;
    private final double DIME = 10;
    private final double QUARTER = 25;
    private final double DOLLAR = 100;
    private String input;
    private double balance;
    public Coin() {
        balance = 0;
    }

    /**
     * This method allows a user to add coins to their balance.
     * @param aCoin
     */
    public void addCoin(String aCoin) {
        input = aCoin;
        if (input.equalsIgnoreCase("penny")) {
            balance = balance + PENNY;
        }
        if (input.equalsIgnoreCase("nickel")) {
            balance = balance + NICKEL;
        }
        if (input.equalsIgnoreCase("dime")) {
            balance = balance + DIME;
        }
        if (input.equalsIgnoreCase("quarter")) {
            balance = balance + QUARTER;
        }
        if (input.equalsIgnoreCase("dollar")) {
            balance = balance + DOLLAR;
        }
    }

    /**
     * This converts the users balance to coins for when they want their money back or when they get change.
     * @return total
     */
    public String returnCoin()
    {
        String total = new String (" ");
        int n = (int) Math.floor(balance/100);
        balance = balance - n * DOLLAR;
        total = total + n + " dollars, ";
        n = (int) Math.floor(balance/25);
        balance = balance - n * QUARTER;
        total = total + n + " quarters, ";
        n = (int) Math.floor(balance/10);
        balance = balance - n * DIME;
        total = total + n + " dimes, ";
        n = (int)Math.floor(balance/5);
        balance = balance - n * NICKEL;
        total = total + n + " nickels, and ";
        n = (int) balance;
        balance = 0;
        total = total + n + " pennies";
        return total;
    }

    /**
     * This method allows us to change the balance after the user has received their drink so that we can make change.
     * @param value
     */
    public void makeChange(double value)
    {
        balance = balance - value * 100;
    }

    /**
     * This method returns balance.
     * @return balance
     */
    public double returnBalance() {
        return balance / 100;
    }
}