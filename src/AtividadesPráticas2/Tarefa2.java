package AtividadesPráticas2;

import java.util.Scanner; // importar a classe Scanner para ler a entrada do usuário
import java.util.InputMismatchException; // importar a classe InputMismatchException para tratar entradas inválidas

public class Tarefa2 {

    public static void main(String[] args) {
        // declarar as variáveis para armazenar os dados dos alunos
        int quantidade; // a quantidade de alunos
        String[] nomes; // o vetor de nomes
        int[] idades; // o vetor de idades
        double[] medias; // o vetor de médias

        // criar um objeto da classe Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // pedir ao usuário que digite a quantidade de alunos
        System.out.println("Digite a quantidade de alunos:");
        // usar um laço while para validar a entrada
        while (true) {
            try {
                // tentar ler a quantidade como um inteiro
                quantidade = entrada.nextInt();
                // se a quantidade for positiva, sair do laço
                if (quantidade > 0) {
                    break;
                } else {
                    // se a quantidade for negativa ou zero, mostrar uma mensagem de erro
                    System.out.println("A quantidade deve ser maior que zero. Tente novamente:");
                }
            } catch (InputMismatchException e) {
                // se a entrada não for um inteiro, mostrar uma mensagem de erro
                System.out.println("Entrada inválida. Digite um número inteiro. Tente novamente:");
                // descartar a entrada inválida
                entrada.next();
            }
        }

        // inicializar os vetores com a quantidade informada
        nomes = new String[quantidade];
        idades = new int[quantidade];
        medias = new double[quantidade];

        // usar um laço for para ler os dados de cada aluno
        for (int i = 0; i < quantidade; i++) {
            // pedir ao usuário que digite o nome do aluno
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            // ler o nome como uma string
            nomes[i] = entrada.next();

            // pedir ao usuário que digite a idade do aluno
            System.out.println("Digite a idade do aluno " + (i + 1) + ":");
            // usar um laço while para validar a entrada
            while (true) {
                try {
                    // tentar ler a idade como um inteiro
                    idades[i] = entrada.nextInt();
                    // se a idade for positiva, sair do laço
                    if (idades[i] > 0) {
                        break;
                    } else {
                        // se a idade for negativa ou zero, mostrar uma mensagem de erro
                        System.out.println("A idade deve ser maior que zero. Tente novamente:");
                    }
                } catch (InputMismatchException e) {
                    // se a entrada não for um inteiro, mostrar uma mensagem de erro
                    System.out.println("Entrada inválida. Digite um número inteiro. Tente novamente:");
                    // descartar a entrada inválida
                    entrada.next();
                }
            }

            // pedir ao usuário que digite a média do aluno
            System.out.println("Digite a média do aluno " + (i + 1) + ":");
            // usar um laço while para validar a entrada
            while (true) {
                try {
                    // tentar ler a média como um double
                    medias[i] = entrada.nextDouble();
                    // se a média for entre 0 e 10, sair do laço
                    if (medias[i] >= 0 && medias[i] <= 10) {
                        break;
                    } else {
                        // se a média for fora desse intervalo, mostrar uma mensagem de erro
                        System.out.println("A média deve ser entre 0 e 10. Tente novamente:");
                    }
                } catch (InputMismatchException e) {
                    // se a entrada não for um double, mostrar uma mensagem de erro
                    System.out.println("Entrada inválida. Digite um número decimal. Tente novamente:");
                    // descartar a entrada inválida
                    entrada.next();
                }
            }
        }

        // mostrar os dados dos alunos na saída
        System.out.println("Os dados dos alunos são:");
        // usar um laço for para imprimir cada aluno em uma linha
        for (int i = 0; i < quantidade; i++) {
            // imprimir o nome, a idade e a média separados por hífen
            System.out.println(nomes[i] + " - " + idades[i] + " anos - " + medias[i]);
        }
    }
}
