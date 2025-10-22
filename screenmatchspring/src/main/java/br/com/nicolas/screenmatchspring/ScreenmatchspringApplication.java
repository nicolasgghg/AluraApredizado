package br.com.nicolas.screenmatchspring;

import br.com.nicolas.screenmatchspring.model.DadosSerie;
import br.com.nicolas.screenmatchspring.service.ConsumoAPI;
import br.com.nicolas.screenmatchspring.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchspringApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(ScreenmatchspringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=e5b275f7");
        System.out.println(json);
//        json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
//        System.out.println(json);

        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

        System.out.println(dados);


    }



}
