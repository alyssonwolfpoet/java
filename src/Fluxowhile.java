public class Fluxowhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) { // conta de 1 em 1 de forma crescente
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < 10) { // conta de forma 2 em 2 de forma crescente
            System.out.print(i + " ");
            i+=2;
        }
        System.out.println();
        i--; // i = i-1
        while (i >= 0) { // conta de forma 1 em 1 de forma decrescente
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        i = 9;
        while (i >= 0) { // conta de forma 2 em 2 de forma decrescente
            System.out.print(i + " ");
            i-=2;
        }
    }
}
