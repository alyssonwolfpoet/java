package AtividadesPráticas;

public class Tarefa8 {
    public static void main(String[] args) {
        // Criar uma matriz 4x4 de inteiros
        int[][] matriz = new int[4][4];

// Preencher a matriz com a regra da tarefa
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Se for a primeira posição, o elemento é 2
                if (i == 0 && j == 0) {
                    matriz[i][j] = 2;
                }
                // Se for a primeira linha, o elemento é a soma do índice atual com o elemento anterior
                else if (i == 0) {
                    matriz[i][j] = i + j + matriz[i][j-1];
                }
                // Se for a primeira coluna, o elemento é a soma do índice atual com o elemento acima
                else if (j == 0) {
                    matriz[i][j] = i + j + matriz[i-1][j];
                }
                // Se for outra posição, o elemento é a soma do índice atual com o elemento diagonalmente acima
                else {
                    matriz[i][j] = i + j + matriz[i-1][j-1];
                }
            }
        }

// Imprimir a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
