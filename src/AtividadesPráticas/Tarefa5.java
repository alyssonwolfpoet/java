package AtividadesPráticas;

// Importando a classe Scanner para entrada de dados
import java.util.Scanner;

// Definindo a classe Fatorial
public class Tarefa5 {

    // Definindo o método principal
    public static void main(String[] args) {

        // Criando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // Declarando as variáveis
        int n; // variável para armazenar o número a ser calculado
        int fatorial; // variável para armazenar o resultado do cálculo

        // Solicitando e lendo o número a ser calculado
        System.out.println("Digite um número entre 0 e 10 para calcular seu fatorial:");
        n = entrada.nextInt();

        // Fechando o objeto da classe Scanner
        entrada.close();

        // Verificando se o número é válido
        if (n >= 0 && n <= 10) {
            // Chamando o método que calcula o fatorial
            fatorial = calcularFatorial(n);
            // Exibindo o resultado
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        } else {
            // Exibindo uma mensagem de erro
            System.out.println("Número inválido!");
        }
    }

    // Definindo o método que calcula o fatorial usando a estrutura de repetição FOR
    public static int calcularFatorial(int numero) {
        // Inicializando a variável que armazena o resultado do cálculo
        int fatorial = 1;
        // Verificando se o número é zero
        if (numero == 0) {
            // Retornando 1, pois 0! é igual a 1
            return 1;
        } else {
            // Usando um laço de repetição para multiplicar o número pelos seus antecessores
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }
            // Retornando o resultado do cálculo
            return fatorial;
        }
    }
}

