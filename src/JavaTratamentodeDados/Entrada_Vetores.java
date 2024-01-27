package JavaTratamentodeDados;

import java.util.Scanner;

public class Entrada_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("DIgite os elementos do vetor: ");
        for (int i = 0; i < tamanho; i++){
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor lido, agora vamos realizar a impressão...");
        for (int i = 0; i < tamanho;i++){
            System.out.print(vetor[i]+ " ");
        }
        sc.close();
    }
}
