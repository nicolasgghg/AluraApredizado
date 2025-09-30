
import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 2500.0;
        String userName = "User01";
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
                case 1 -> checkBalance();
                case 2 -> System.out.println("Recive Money");
                case 3 -> System.out.println("Transfer Money");
                case 4 -> System.out.println("Exit");
                default -> System.out.println("Invalid option");
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
        System.out.println("Balance");


    }
}
