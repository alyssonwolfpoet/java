package JavaProgramaçãoOrientadaaoObjeto.Sobrecrista_Sobrecarga;

import JavaProgramaçãoOrientadaaoObjeto.Conceito_Heranca.Funcionario;

public class Operario extends Funcionario {
    public int meta;

    @Override
    public void saudacao() {
        super.saudacao();
        System.out.println("Ola, tudo bem?");
    }

    @Override
    protected float horaExtre(int h, int f) {
        return (h*2)+(f*3);
    }

    public void Trabalhar(){}
    public void Trabalhar(int h){}
    public void Trabalhar(char g){}
    public void Trabalhar(int x,int h){}
}
