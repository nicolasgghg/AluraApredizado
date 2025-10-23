package manipulando_colecoes_de_dados.ex02;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
