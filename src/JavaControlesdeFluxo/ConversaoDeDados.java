package JavaControlesdeFluxo;

public class ConversaoDeDados {
    public static void main(String[] args) {
        String str = "100";
            System.out.println(Integer.valueOf(str)+200);
            System.out.println(Byte.valueOf(str)+200);
            System.out.println(Short.valueOf(str)+200);
            System.out.println(Float.valueOf(str)+200);
            System.out.println(Double.valueOf(str)+200);
            System.out.println("______________________________________");
        Byte b = 10;
            System.out.println(b.intValue());
            System.out.println(b.shortValue());
            System.out.println(b.floatValue());
            System.out.println(b.doubleValue());
            System.out.println(b.toString());
        System.out.println("______________________________________");
        Double c = 1243.356456456568678678;
        System.out.println(c.intValue());
        System.out.println(c.floatValue());
    }
}
