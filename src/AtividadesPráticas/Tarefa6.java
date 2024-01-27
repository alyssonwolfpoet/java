package AtividadesPráticas;

public class Tarefa6 {
    // Método recursivo para calcular o n-ésimo termo da sequência de Fibonacci
    public static long fibo(int n) {
        // Caso base: os dois primeiros termos são 1
        if (n == 1 || n == 2) {
            return 1;
        }
        // Caso geral: o termo é a soma dos dois anteriores
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {


// Número de termos desejados
        int ntermos = 12;

// Imprimir os termos da sequência com hífens
        System.out.println("Sequência de Fibonacci:");
        for (int i = 1; i <= ntermos; i++) {
            System.out.print(fibo(i));
            // Se não for o último termo, imprimir um hífen
            if (i < ntermos) {
                System.out.print(" - ");
            }
        }

    }
}
