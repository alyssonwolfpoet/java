package JavaProgramaçãoOrientadaaoObjeto.construtor;

public class Main_Construtor {
    public static void main(String[] args) {
        Construtor c2 = new Construtor("Aluasson");
        Construtor c = new Construtor();
        System.out.println(c.idade);
        System.out.println(c.nome);
        System.out.println(c.saldo);
        System.out.println(c2.idade);
        System.out.println(c2.nome);
        System.out.println(c2.saldo);
    }
}
