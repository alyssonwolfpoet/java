package JavaProgramaçãoOrientadaaoObjeto.cliente;

public class Base2 {
    public static void main(String[] args) {

            Cliente2 c = new Cliente2();
            c.setNome("Alysson");
            System.out.println("O nome informado é: "+ c.getNome());
            c.consumo= 1090f;
            System.out.println("O consumo foi de: "+c.consumo);
            c.setAnoNascimento(1993);
            System.out.println("O ano de nascimento é: "+ c.getAnoNascimento());

           //CLente2 c2 = c; // está apontando pro objeto c
        Cliente2 c2 = new Cliente2();
            c2.setNome("Alysson2");
        System.out.println("Pessoa 1: "+ c.getNome());
        System.out.println("Pessoa 2: "+ c2.getNome());
    }
}
