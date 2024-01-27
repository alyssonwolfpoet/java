package AtividadesPráticas;

// Importando a classe Scanner para entrada de dados
import java.util.Scanner;

// Definindo a classe Salarios
public class Tarefa4 {

    // Definindo o método principal
    public static void main(String[] args) {

        // Criando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // Declarando as variáveis
        String[] nomes; // vetor para armazenar os nomes
        float[] salarios; // vetor para armazenar os salários
        int n; // variável para armazenar o número de funcionários
        int pos; // variável para armazenar a posição consultada

        // Solicitando e lendo o número de funcionários
        System.out.println("Digite o número de funcionários:");
        n = entrada.nextInt();

        // Alocando espaço para os vetores
        nomes = new String[n];
        salarios = new float[n];

        // Lendo os dados dos funcionários
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ":");
            nomes[i] = entrada.next();
            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
            salarios[i] = entrada.nextFloat();
        }

        // Solicitando e lendo a posição a ser consultada
        System.out.println("Digite a posição que deseja consultar (de 0 a " + (n - 1) + "):");
        pos = entrada.nextInt();

        // Fechando o objeto da classe Scanner
        entrada.close();

        // Verificando se a posição é válida
        if (pos >= 0 && pos < n) {
            // Exibindo o nome e o salário da posição consultada
            System.out.println("O nome do funcionário na posição " + pos + " é: " + nomes[pos]);
            System.out.println("O salário do funcionário na posição " + pos + " é: R$ " + salarios[pos]);
        } else {
            // Exibindo uma mensagem de erro
            System.out.println("Posição inválida!");
        }
    }
}

