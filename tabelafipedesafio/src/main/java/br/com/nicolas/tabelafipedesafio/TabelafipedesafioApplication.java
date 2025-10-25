package br.com.nicolas.tabelafipedesafio;

import br.com.nicolas.tabelafipedesafio.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelafipedesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelafipedesafioApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
			Principal principal = new Principal();
			principal.exibeMenu();
	}
}
