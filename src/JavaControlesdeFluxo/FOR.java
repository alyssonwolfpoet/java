package JavaControlesdeFluxo;

public class FOR {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {//inicio;condição de parada;forma de contar
            System.out.print(i + " "); // i++ -> i+=1 -> i = i + 1
        }
        System.out.println();
        for (int i = 9;i>=0;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0;i<10;i+=2){ //contando de 2 em 2 de forma crescente
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 9;i>=0;i-=2){ //contando de 2 em 2 de forma decrescente
            System.out.print(i + " ");
        }
    }
}
