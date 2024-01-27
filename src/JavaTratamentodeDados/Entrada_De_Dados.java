package JavaTratamentodeDados;

import java.util.Scanner;

public class Entrada_De_Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número do tipo Inteiro: ");
        int x = sc.nextInt();
        System.out.println("O número digitado foi: "+x);

        System.out.println("Informe um número do tipo Decimal: ");
        Double y = sc.nextDouble();
        System.out.println("O número digitado foi: "+y);

        sc.nextLine();
        System.out.println("Informe um nome: ");
        String str = sc.nextLine();
        System.out.println("O nome digitado foi: "+str);
    }
}
