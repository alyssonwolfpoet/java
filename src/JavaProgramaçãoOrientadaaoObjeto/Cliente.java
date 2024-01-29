package JavaProgramaçãoOrientadaaoObjeto;

public class Cliente {
    public String nome;
    private int anoNascimento;
    // get e set
    protected float consumo;


    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if ((anoNascimento<1960) || (anoNascimento>2005)){
            throw new Exception("O an de nascimento é invalido");
        }
        this.anoNascimento = anoNascimento;
    }
}
// public -> não realiza retiricoes de acesso a variaveis e /ou a metodos
// Private > atribuito ou metodo fica disponivel somente a classe a que pertence
// protected -> esta disponivel ao pacote a que pertence.