package JavaProgramaçãoOrientadaaoObjeto;

public class Construtor2 {
    public Integer idade;
    public int id;
    public Float saldo;
    public String nome;

    public Construtor2(int idade,float saldo,String nome){
        this.idade = idade;
        this.saldo= saldo;
        this.nome= nome;
    }
    public Construtor2(){
        idade = 0;
        saldo= 0.0f;
       nome= "Cliente";

    }
}
