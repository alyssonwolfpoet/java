package JavaControlesdeFluxo;

public class Operadores_Math {
    public static void main(String[] args) {
        System.out.println("5 + 2 =" +(5+2));
        System.out.println("5 - 2 =" +(5-2));
        System.out.println("5 * 2 =" +(5*2));
        System.out.println("5 / 2 =" +(5/2));
        System.out.println("5 % 2 =" +(5%2));
        float a = 5.0f;
        float b = 2.0f;
        System.out.println("A / b = "+ (a/b));

        int x=10;
        System.out.println(x);
        int y = 20;
        //x = x+y;
        x+=y;
        System.out.println(x);
        y++;
        y = y + 1;
        y+=1;
        System.out.println(y); //23
    }
}
