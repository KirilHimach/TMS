package homeworkSix;

import java.util.Arrays;

public class ATMMachine {
    private int twentyBill;
    private int fiftyBill;
    private int oneHundredBill;
    private final int[] issueCash = new int[3];

    static {
        System.out.println("The ATM machine has only 20, 50 and 100 bills!");
        System.out.println();
    }

    public ATMMachine(int twentyBill, int fiftyBill, int oneHundredBill) {
        this.twentyBill = twentyBill;
        this.fiftyBill = fiftyBill;
        this.oneHundredBill = oneHundredBill;
    }

    public void addCash(int twentyBill, int fiftyBill, int oneHundredBill) {
        this.twentyBill += twentyBill;
        this.fiftyBill += fiftyBill;
        this.oneHundredBill += oneHundredBill;
        System.out.println("The operation was completed successfully.");
        System.out.printf("The ATM machine has %d$ now.\n", sumCashATMMachine());
        System.out.println();
    }

    public boolean withdrawCash(int cash) {
        if (mathWithdrawCash(cash)) {
            System.out.println("The operation was completed successfully.");
            System.out.printf("The ATM machine has %d$ now.\n", sumCashATMMachine());
            return true;
        } else {
            System.out.println("Operation failed");
            return false;
        }
    }

    private boolean mathWithdrawCash(int cash) {
        if (sumCashATMMachine() < cash) {
            System.out.println("There is not enough money in the ATM.");
            return false;
        } else if (cash < 1) {
            System.out.println("You entered the wrong amount!");
            return false;
        } else if (searchCash(cash)) {
            System.out.println("Take your money!");
            System.out.printf("You have received %d $20 bills, %d $50 bills, " +
                    "%d $100 bills.\n", issueCash[0], issueCash[1], issueCash[2]);
            changeBalanceATM();
            return true;
        } else return false;
    }

    private void changeBalanceATM() {
        twentyBill -= issueCash[0];
        fiftyBill -= issueCash[1];
        oneHundredBill -= issueCash[2];
        Arrays.fill(issueCash, 0);
    }

    private boolean searchCash(int cash) {
        int twentyBill = this.twentyBill;
        int fiftyBill = this.fiftyBill;
        int oneHundredBill = this.oneHundredBill;
        while (cash > 0) {
            if (cash >= 100 && oneHundredBill > 0) {
                cash -= 100;
                issueCash[2]++;
                oneHundredBill--;
            } else if (cash >= 50 && fiftyBill > 0) {
                cash -= 50;
                issueCash[1]++;
                fiftyBill--;
            } else if (cash >= 20 && twentyBill > 0) {
                cash -= 20;
                issueCash[0]++;
                twentyBill--;
            } else {
                System.out.println("You entered the wrong amount!");
                return false;
            }
        }
        return true;
    }

    private int sumCashATMMachine() {
        return (twentyBill * 20) + (fiftyBill * 50) + (oneHundredBill * 100);
    }
}
