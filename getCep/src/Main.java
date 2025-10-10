public class Main {
    public static void main(String[] args) {
        ZipCodeQuery zipCodeQuery = new ZipCodeQuery();
        AddressViaCep viaCep = zipCodeQuery.getAddressViaCep("01001000");
        System.out.println(viaCep);
        Address address = new Address(viaCep);
        System.out.println(address);
    }
}
