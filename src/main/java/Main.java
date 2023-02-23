import homeworkSix.ATMMachine;
import homeworkSix.Computer;
import homeworkSix.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("QWERTY453", 1250);
        CreditCard card2 = new CreditCard("PORT777", 999);
        CreditCard card3 = new CreditCard("BOND007", 1);
        card1.addAccountAmount(300);
        card2.addAccountAmount(1_000_000);
        card3.withdrawCash(1000);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println();
        System.out.println("                     ---------------------------------------");

        ATMMachine machine = new ATMMachine(1, 3, 1);
        machine.addCash(100, 1, 0);
        machine.withdrawCash(520);
        System.out.println();
        machine.withdrawCash(-20);
        System.out.println();
        machine.withdrawCash(70);
        System.out.println();
        machine.withdrawCash(6_000_000);
        System.out.println();
        System.out.println("                     ---------------------------------------");

        Computer computer1 = new Computer(1530, "Rocket");
        Computer computer2 = new Computer(9999, "IronBoss",
                new Computer.RAM("DDR", 55),
                new Computer.HDD("NorthDigital", 45, true));
        System.out.println(computer1);
        System.out.println(computer2);
    }
}
