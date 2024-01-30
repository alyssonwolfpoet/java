package JavaProgramaçãoOrientadaaoObjeto.Conceito_Heranca;

public class Main_Func {
    public static void main(String[] args) {
        Operario op = new Operario();
        op.nome = "Marcos";
        op.idade = 19;
        op.salario = 1456f;
        op.bonus = 300f; //1756
        float h= op.horaExtre(10,10);//1756 + 35 = 1791

        System.out.println("O GAnho mensal do Funcionário " + op.nome + " é de: "+(op.salario+op.bonus+h));
    }
}
