package JavaProgramaçãoOrientadaaoObjeto.cliente;

public class Cliente3 {
    private String nome;
    public  String nome2;
    private int anoNascimento;
    // get e set
    protected float consumo;


    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if ((anoNascimento < 1960) || (anoNascimento > 2005)) {
            this.anoNascimento = 0;
        }
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
// public -> não realiza retiricoes de acesso a variaveis e /ou a metodos
// Private > atribuito ou metodo fica disponivel somente a classe a que pertence
// protected -> esta disponivel ao pacote a que pertence.