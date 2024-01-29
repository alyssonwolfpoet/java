package JavaProgramaçãoOrientadaaoObjeto.Estaticos;

public class Estatico {
    public static int u = 10;
    protected static int contador = 0;
    public static int o = 10;

    public Estatico() {
        contador++;
    }
    public static int j(){
        return 1+1;
    }

    public static String messagem(){
        return "ola seu nome é?";
    }
    public static void mensagem_2(){
        System.out.println("Testando metodo void");
        System.out.println(messagem());
        System.out.println(j());
        int h = o;
        System.out.println(h);
    }
}
