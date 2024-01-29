package AtividadesPráticas2;

// Importar a classe Scanner
import java.util.Scanner;

// Criar uma classe para a soma de matrizes
class Tarefa4 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Pedir ao usuário as dimensões das matrizes
        System.out.println("Digite o número de linhas das matrizes:");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas das matrizes:");
        int colunas = sc.nextInt();

        // Verificar se as dimensões são válidas
        if (linhas <= 0 || colunas <= 0) {
            System.out.println("As dimensões devem ser positivas.");
            return;
        }

        // Criar as matrizes de inteiros
        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] soma = new int[linhas][colunas];

        // Pedir ao usuário os elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Pedir ao usuário os elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Calcular a soma das matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimir o resultado da soma
        System.out.println("A soma das matrizes é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

    }
}
