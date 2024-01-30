package JavaProgramaçãoOrientadaaoObjeto.Sobrecrista_Sobrecarga;

import JavaProgramaçãoOrientadaaoObjeto.Conceito_Heranca.Gerente;

public class Funcionario extends Gerente {
    public String nome;
    protected int idade;
    protected float salario;
    protected float bonus;

    protected float horaExtre(int h,int f){
        return (h*1.5f)+(f*2f);
    }
    public void saudacao(){
        System.out.println("Olá");
    }

}
