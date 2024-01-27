package JavaControlesdeFluxo;

public class IF_aninhado {
    public static void main(String[] args) {
        int v = 4;
        if (v % 2 == 0) { //nivel 1
            if (v % 3 == 0) { //nivel 2
                if (v % 4 == 0) { // nivel 3
                    System.out.println("O número é divisível por 4 e por 6");
                }else {
                    System.out.println("O numero é divisível por 6");
                }
            } else {
                System.out.println("O número é divisível por 2");
            }
        } else {
            System.out.println("o número é divisível por " + v);
        }
    }
}
