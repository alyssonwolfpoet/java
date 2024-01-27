package AtividadesPráticas;

import java.util.Arrays;

public class Terefa2 {
    public static void main(String[] args) {
        /*String str[]={"laranja","manga","banana","uva","marçã","tangerina","limao","a","b"};
        System.out.println(Arrays.stream(str).toList());
        System.out.println(str.);*/
        // Declaração do vetor de String's com nove posições
        String[] frutas = new String[9];

// Atribuição de valores ao vetor
        frutas[0] = "maçã";
        frutas[1] = "banana";
        frutas[2] = "laranja";
        frutas[3] = "manga";
        frutas[4] = "abacaxi";
        frutas[5] = "uva";
        frutas[6] = "melancia";
        frutas[7] = "morango";
        frutas[8] = "kiwi";

        // Acessando a primeira posição do vetor (índice 0)
        System.out.println("A primeira fruta é: " + frutas[0]);

        // Acessando a última posição do vetor (índice tamanho - 1)
        System.out.println("A última fruta é: " + frutas[frutas.length - 1]);

        // Calculando a posição mediana do vetor (índice tamanho / 2)
        int mediana = frutas.length / 2;

        // Acessando a posição mediana do vetor
        System.out.println("A fruta que está na posição mediana é: " + frutas[mediana]);



    }
}
