package JavaProgramaçãoOrientadaaoObjeto.abstrato;


public abstract class Funcionario { // final usada na classe restringe a mesma de herança
    public String nome;
    protected int idade;
    protected float salario;
    protected float bonus;
    public  final int teste = 20; // nao consegue realizar a mudança para outro valor da variavel (Constante)
    public abstract void PagarImposto();
    protected float horaExtre(int h,int f){
        return (h*1.5f)+(f*2f);
    }
    public void saudacao(){
        System.out.println("Olá");
    } //final -> metodo nao sera disponivel oara realiar override



}
