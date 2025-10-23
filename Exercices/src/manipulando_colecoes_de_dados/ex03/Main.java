package manipulando_colecoes_de_dados.ex03;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> newNumbers = number.stream()
                .filter(n -> n%2!=0)
                .map(n -> n*2)
                .toList();
        System.out.println(newNumbers);
    }
}
