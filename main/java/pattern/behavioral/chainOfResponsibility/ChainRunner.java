package pattern.behavioral.chainOfResponsibility;

import java.util.Scanner;

public class ChainRunner {

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            while(amount % 10 != 0){
                System.out.println("Amount should be in multiple of 10s.");
                amount = input.nextInt();
            }

            // process the request
            atmDispenser.getChainStart().dispense(new Currency(amount));
            System.out.println("Dispensed!");
        }
    }
}
