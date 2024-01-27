package AtividadesPráticas;

// Importando a classe Scanner para entrada de dados

import java.util.Scanner;

// Definindo a classe Bônus
public class Tarefa3 {

    // Definindo o método principal
    public static void main(String[] args) {

        // Criando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // Declarando as variáveis
        double salarioBase, bonus, salarioTotal;
        int anos, avaliacao;

        // Solicitando e lendo os dados do funcionário
        System.out.println("Digite o salário base do funcionário:");
        salarioBase = entrada.nextDouble();

        System.out.println("Digite o número de anos que o funcionário trabalhou na empresa:");
        anos = entrada.nextInt();

        System.out.println("Digite a avaliação de desempenho do funcionário (de 1 a 5):");
        avaliacao = entrada.nextInt();

        // Fechando o objeto da classe Scanner
        entrada.close();

        // Calculando o bônus de acordo com as condições
        if (avaliacao == 5 && anos > 3) {
            bonus = salarioBase * 0.2; // 20% do salário base
        } else if (avaliacao == 4 && anos > 2) {
            bonus = salarioBase * 0.15; // 15% do salário base
        } else if (avaliacao == 3 && anos > 1) {
            bonus = salarioBase * 0.1; // 10% do salário base
        } else {
            bonus = salarioBase * 0.05; // 5% do salário base
        }

        // Calculando o salário total
        salarioTotal = salarioBase + bonus;

        // Exibindo os resultados
        System.out.println("O salário base do funcionário é: R$ " + salarioBase);
        System.out.println("O bônus calculado é: R$ " + bonus);
        System.out.println("O salário total é: R$ " + salarioTotal);
    }
}

