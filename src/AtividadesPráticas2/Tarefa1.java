package AtividadesPráticas2;

import java.util.Scanner; // importar a classe Scanner para ler a entrada do usuário

public class Tarefa1 {

    public static void main(String[] args) {
        // declarar as variáveis para armazenar os números e o operador
        double num1, num2, resultado = 0;
        char operador;

        // criar um objeto da classe Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // pedir ao usuário que digite os números e o operador
        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextDouble(); // ler o primeiro número como um double

        System.out.println("Digite o segundo número:");
        num2 = entrada.nextDouble(); // ler o segundo número como um double

        System.out.println("Digite o operador (+, -, *, /):");
        operador = entrada.next().charAt(0); // ler o operador como um char

        // usar um switch para executar a operação correspondente
        try {
            switch (operador) {
                case '+': // se o operador for +
                    resultado = num1 + num2; // somar os números
                    break; // sair do switch
                case '-': // se o operador for -
                    resultado = num1 - num2; // subtrair os números
                    break; // sair do switch
                case '*': // se o operador for *
                    resultado = num1 * num2; // multiplicar os números
                    break; // sair do switch
                case '/': // se o operador for /
                    // verificar se o segundo número é zero para evitar a divisão por zero
                    if (num2 == 0) {
                        // lançar uma exceção com uma mensagem de erro
                        throw new ArithmeticException("Não é possível dividir por zero");
                    }
                    resultado = num1 / num2; // dividir os números
                    break; // sair do switch
                default: // se o operador não for nenhum dos casos anteriores
                    // lançar uma exceção com uma mensagem de erro
                    throw new IllegalArgumentException("Operador inválido");
            }
        } catch (ArithmeticException e) {
            System.out.println("Nao existe divisao por zero.");
        }

        // mostrar o resultado na saída
        System.out.println("O resultado é: " + resultado);
    }
}

