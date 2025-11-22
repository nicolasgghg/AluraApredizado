public class Address {
    private String zipCode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;

    public Address(String zipCode, String street, String complement, String neighborhood, String city, String state) {
        this.zipCode = zipCode;
        this.street = street;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
    }

    public Address(AddressViaCep addressViaCep) {
        this.zipCode = addressViaCep.cep();
        this.street = addressViaCep.logradouro();
        this.complement = addressViaCep.complemento();
        this.neighborhood = addressViaCep.bairro();
        this.city = addressViaCep.localidade();
        this.state = addressViaCep.uf();
    }

    @Override
    public String toString() {
        return "Address [zipCode=" + zipCode + ", street=" + street + ", complement=" + complement + ", neighborhood="
                + neighborhood + ", city=" + city + ", state=" + state + "]";
    }

    public String getZipCode() {
        return zipCode;
    }
}
