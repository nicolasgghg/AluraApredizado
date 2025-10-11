import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZipCodeQuery zipCodeQuery = new ZipCodeQuery();

        System.out.println("Enter the zip code: ");
        String zipCode = scanner.nextLine();

        try {
            AddressViaCep viaCep = zipCodeQuery.getAddressViaCep(zipCode);
            System.out.println(viaCep);
            Address address = new Address(viaCep);
            System.out.println(address);
            ArchiveGenerator archiveGenerator = new ArchiveGenerator();
            archiveGenerator.generateJson(address);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finish the program");
        }


    }
}
