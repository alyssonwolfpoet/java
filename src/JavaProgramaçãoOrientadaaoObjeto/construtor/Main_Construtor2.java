package JavaProgramaçãoOrientadaaoObjeto.construtor;

public class Main_Construtor2 {
    public static void main(String[] args) {
        Construtor2 c2 = new Construtor2(12,1000,"Alyson");
        Construtor2 c = new Construtor2();
        System.out.println(c.idade);
        System.out.println(c.nome);
        System.out.println(c.saldo);
        System.out.println(c2.idade);
        System.out.println(c2.nome);
        System.out.println(c2.saldo);
    }
}
