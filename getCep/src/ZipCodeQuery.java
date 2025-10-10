import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ZipCodeQuery {

    public AddressViaCep getAddressViaCep(String zipCode) {
        URI address = URI.create("https://viacep.com.br/ws/" + zipCode + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Is not possible to query the zip code");
        }

        return new Gson().fromJson(response.body(), AddressViaCep.class);
    }

}
