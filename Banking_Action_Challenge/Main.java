
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    static double balance = 2500.0;
    static String userName = "User01";

    public static void main(String[] args) {

        int option = 0;

        System.out.println(String.format("""
            ********************************
            Initial Client Date

            Name:           %s
            Account Type:   Current
            Balance:        %.2f


            ********************************
            """, userName, balance));

        while (option != 4) {

            optionsMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1 ->
                    checkBalance();
                case 2 ->
                    reciveMoney();
                case 3 ->
                    transferMoney();
                case 4 ->
                    System.out.println("Exit");
                default ->
                    System.out.println("Invalid option");
            }
        }

    }

    private static void optionsMenu() {

        System.out.println("""
                Choose an option

                1) Check Balance
                2) Recive Money
                3) Transfer Money
                4) Exit
                """);

    }

    private static void checkBalance() {
        System.out.println(String.format("Balance: %.2f", balance));

    }

    private static void reciveMoney() {
        System.out.println("Write the amount to recive: ");
        double amount = scanner.nextDouble();
        balance += amount;

        System.out.println(String.format("Your new balance: %.2f", balance));
    }

    private static void transferMoney() {
        System.out.println("Write the amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println(String.format("Your new balance: %.2f", balance));
        }

    }

}
