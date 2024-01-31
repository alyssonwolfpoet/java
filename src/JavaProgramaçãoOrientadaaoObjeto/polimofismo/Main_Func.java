package JavaProgramaçãoOrientadaaoObjeto.polimofismo;

public class Main_Func {
    public static void main(String[] args) {
       Funcionario f1 = new Gerente();
       Funcionario f2 = new Operario();

       //Gerente g1 = new Funcionario();
        //Operario opt = new Funcionario();
        Gerente g1 =new Gerente();
        Operario op1 = new Operario();
        polimofismo(f1);
        polimofismo(f2);
        polimofismo(g1);
        polimofismo(op1);

    }
    private static void polimofismo(Funcionario f){
        f.PagarImposto();
    }
}
