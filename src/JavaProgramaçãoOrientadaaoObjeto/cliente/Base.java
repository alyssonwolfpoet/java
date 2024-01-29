package JavaProgramaçãoOrientadaaoObjeto.cliente;

public class Base {
    public static void main(String[] args) {
        try {
            Cliente c = new Cliente();
            c.nome = "Alysson";
            System.out.println("O nome informado é: "+ c.nome);
            c.consumo= 1090f;
            System.out.println("O consumo foi de: "+c.consumo);
            c.setAnoNascimento(-1993);
            System.out.println("O ano de nascimento é: "+ c.getAnoNascimento());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
