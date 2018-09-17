import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Coin num;
        Soda a;
        String payment;
        final double SODAPRICE = 0.85;
        a = new Soda();
        num = new Coin();
        a.sodaRefill(1);
        Scanner userInput = new Scanner(System.in);
       /* the user can keep getting drinks without having to restart the class because of this do while loop */
        do {
            System.out.println("Please pick which soda you want. Each soda is $.85");
            System.out.println("0 -- Coke; 1 -- Orange; 2 -- Diet Coke; 3 -- Sprite");
            int sodaIndex = userInput.nextInt();
          /* This loop runs until the user has put in enough money to pay for the soda; if the user enters "STOP" they get their money back*/
            while (num.returnBalance() < SODAPRICE) {
                System.out.println("Put in a coin please (as a String). If you enter 'STOP' we will return your money.");
                payment = userInput.nextLine();
              /* This returns the user's money if they want it back */
                if (payment.equalsIgnoreCase("STOP")) {
                    System.out.println("Here is your money back: " + num.returnCoin());
                    break;
                } else {
                    num.addCoin(payment);
                }
            }
          /* This gives the user their soda and change; if they want their money back, they can enter "STOP" to get it back */
            if (num.returnBalance() > SODAPRICE) {
                System.out.println("Would you like your money back or would you like to proceed? Enter STOP to break.");
                payment = userInput.nextLine();
                if (payment.equalsIgnoreCase("STOP")) {
                    System.out.println("Here is your money back: " + num.returnCoin());
                } else {
                    System.out.println(a.getSoda(sodaIndex));
                    num.makeChange(SODAPRICE);
                    System.out.println("Here is you change: " + (num.returnCoin()));
                }
                System.out.println("Keep typing to keep going; STOP to break.");
            }
        } while (!userInput.next().equalsIgnoreCase("STOP"));
    }
}