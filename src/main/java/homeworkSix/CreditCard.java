package homeworkSix;

public class CreditCard {
    private final String accountNumber;
    private int accountAmount;

    public CreditCard(String accountNumber, int accountAmount) {
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    public void addAccountAmount(int accountAmount) {
        this.accountAmount += accountAmount;
    }

    public void withdrawCash(int accountAmount) {
        if ((this.accountAmount - accountAmount) >= -1000) {
            this.accountAmount -= accountAmount;
        } else System.out.println("You have exceeded the limit");

    }

    @Override
    public String toString() {
        return "Your account number is " + accountNumber +
                ", your card balance = " + accountAmount + ';';
    }
}
