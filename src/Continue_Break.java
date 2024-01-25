public class Continue_Break {
    public static void main(String[] args) {
        System.out.print("Continue no for:");
        for (int i = 0;i<= 20;i++){
            if (i%2==0){
                continue; // pular para a proxima posição, baseado na condição. (Imprime os impares)
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Break no for:");
        for (int i = 0;i<= 20;i++){
            if (i==10){
                break; //
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Continue no WHILE:");
        int a= 0;
        while (a<=20){
            a++;
            if (a%2==1){
                continue; // impimir os pares
            }
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Break no WHILE:");
        a= 0;
        while (a<=20){
            a++;
            if (a==10){
                break; //
            }
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Continue no DO_WHILE:");
        int b= 0;
        do {
            b++;
            if (b%3==0){
                continue; // nao impimir os numeros divisiveis por 3
            }
            System.out.print(b + " ");
        } while (b<=20);
        System.out.println();
        System.out.print("Break no DO_WHILE:");
        b= 0;
        do {
            b++;
            if (b==10){
                break; //
            }
            System.out.print(b + " ");
        } while (b<=20);

    }
}
