package JavaProgramaçãoOrientadaaoObjeto.construtor;

public class Construtor {
    public Integer idade;
    public Float saldo;
    public String nome;

    public Construtor(String h){
        idade = 10;
        saldo= 1.0f;
        nome= h;
    }
    public Construtor(){
        idade = 0;
        saldo= 0.0f;
       nome= "Cliente";

    }
}
