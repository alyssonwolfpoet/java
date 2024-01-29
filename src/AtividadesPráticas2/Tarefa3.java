package AtividadesPráticas2;

import java.util.Scanner; // importar a classe Scanner para ler a entrada do usuário

public class Tarefa3 {

    public static void main(String[] args) {
        // declarar as variáveis para armazenar as dimensões e os elementos da matriz
        int linhas, colunas;
        double[][] matriz;

        // criar um objeto da classe Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // pedir ao usuário que digite as dimensões da matriz
        System.out.println("Digite o número de linhas da matriz:");
        linhas = entrada.nextInt(); // ler o número de linhas como um inteiro
        System.out.println("Digite o número de colunas da matriz:");
        colunas = entrada.nextInt(); // ler o número de colunas como um inteiro

        // inicializar a matriz com as dimensões informadas
        matriz = new double[linhas][colunas];

        // pedir ao usuário que digite os elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o elemento da posição [" + i + "][" + j + "]:");
                matriz[i][j] = entrada.nextDouble(); // ler o elemento como um double
            }
        }

        // mostrar a matriz original na saída
        System.out.println("A matriz original é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // nova linha
        }

        // mostrar a matriz transposta na saída
        System.out.println("A matriz transposta é:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(); // nova linha
        }
    }
}
