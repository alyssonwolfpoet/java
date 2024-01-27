package JavaTratamentodeDados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Excecao {
    public static void main(String[] args) {
        String str = "ABC"; // 0 1 2
        String nome = null;
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int x = 10 / 0;
            System.out.println("Tamanho de string nome: " + nome.length());
            System.out.println(str.charAt(3)); // codigo
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Posição invalida"); // tratamento de possivel exceções
        } catch (NullPointerException e) {
            System.out.println("Não existe nome digitado.");
        } catch (ArithmeticException e) {
            System.out.println("Nao existe divisao por zero.");
        } catch (InputMismatchException e) {
            System.out.println("O numero digitatado deve ser do tipo inteiro");
        } catch (Exception e) {
            System.out.println("Exceção genérica");
        }finally {
            scanner.close();
        }


    }
}
