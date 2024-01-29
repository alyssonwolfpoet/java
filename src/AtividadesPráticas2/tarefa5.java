package AtividadesPráticas2;

public class tarefa5 {
    // Criar um método para multiplicar duas matrizes
    public static int[][] multiplicarMatrizes(int[][] m1, int[][] m2) {
        // Verificar se as matrizes são compatíveis para a multiplicação
        if (m1[0].length != m2.length) {
            // Lançar uma exceção se as dimensões não forem válidas
            throw new IllegalArgumentException("As matrizes não podem ser multiplicadas");
        }
        // Criar uma matriz para armazenar o resultado da multiplicação
        int[][] resultado = new int[m1.length][m2[0].length];
        // Percorrer cada elemento das matrizes e multiplicá-los
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                // Inicializar a variável para acumular a soma dos produtos
                int soma = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    // Multiplicar o elemento da linha i da primeira matriz pelo elemento da coluna j da segunda matriz
                    soma += m1[i][k] * m2[k][j];
                }
                // Atribuir a soma ao elemento correspondente da matriz resultado
                resultado[i][j] = soma;
            }
        }
        // Retornar a matriz resultado
        return resultado;
    }

    // Criar um método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        // Percorrer cada linha da matriz
        for (int[] linha : matriz) {
            // Percorrer cada elemento da linha
            for (int elemento : linha) {
                // Imprimir o elemento com um espaço
                System.out.print(elemento + " ");
            }
            // Imprimir uma quebra de linha
            System.out.println();
        }
    }

    // Criar um método principal para testar o algoritmo
    public static void main(String[] args) {
        // Criar duas matrizes de exemplo
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        // Chamar o método para multiplicar as matrizes
        int[][] resultado = multiplicarMatrizes(m1, m2);
        // Imprimir o resultado da multiplicação
        System.out.println("A multiplicação das matrizes é:");
        imprimirMatriz(resultado);
    }

}
