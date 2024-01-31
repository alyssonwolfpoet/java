package JavaProgramaçãoOrientadaaoObjeto.polimofismo;

public class Gerente extends Funcionario {
    @Override
    public void PagarImposto() {
        System.out.println("O gerente paga 15% de imposto");
    }
}
