public class Fluxo_Do_While {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.print(a + " "); // contagem de 1 em 1 de form crescente
            a++;
        } while (a < 10);
        System.out.println();
        int b = 0;
        do {
            System.out.print(b + " "); // contagem de 1 em 1 de form crescente
            b += 2;
        } while (b != 10);
        System.out.println();
        int c = 9;
        do {
            System.out.print(c + " "); // contagem de 1 em 1 de form decrescente
            c--;
        } while (c >= 0);
        System.out.println();
        int d = 9;
        do {
            System.out.print(d + " "); // contagem de 2 em 2 de form decrescente
            d -= 2;
        } while (d >= 0);


        for (int k = 0; k == 8; k++) {
            System.out.println("IMPRIMINDO FOR");
        }
        int e = 0;
        while (e == 8) {
            System.out.println("Imprimindo while");
        }
        System.out.println();
        int f = 0;
        do {
            System.out.println("Imprimindo do while");
        } while (f == 8);
    }
}
