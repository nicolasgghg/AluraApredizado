package br.com.forum_hub.domain.autenticacao.github;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Map;

@Service
public class LoginGithubService {

    @Value("${GITHUB_CLIENT_SECRET}")
    private String clientSecret;

    @Value("${GITHUB_CLIENT_ID}")
    private String clientId;

    private final String redirectUri = "http://localhost:8080/login/github/autorizado";

    private final RestClient restClient;

    public LoginGithubService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.build();
    }

    public String gerarUrl() {
        return "https://github.com/login/oauth/authorize" +
                "?client_id=" + clientId +
                "&redirect_uri=" + redirectUri +
                "&scope=read:user,user:email, public_repo";
    }

    private String obterToken(String code) {
        var response = restClient
                .post()
                .uri("https://github.com/login/oauth/access_token")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(Map.of("code", code, "client_id", clientId, "client_secret", clientSecret, "redirect_uri", redirectUri))
                .retrieve()
                .body(Map.class);


        return response.get("access_token").toString();
    }

    public String obterEmail(String code) {
        var token = obterToken(code);

        var headers = new HttpHeaders();
        headers.setBearerAuth(token);

        var response = restClient
                .get()
                .uri("https://api.github.com/user/emails")
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                    .body(DadosEmail[].class);

        var repositorios = restClient
                .get()
                .uri("https://api.github.com/user/repos")
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(String.class);


        for (DadosEmail email : response) {
            if (email.primary() || email.verified()) {
                return email.email();
            }
        }

        return null;

    }

}
