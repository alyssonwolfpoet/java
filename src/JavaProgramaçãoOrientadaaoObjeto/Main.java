package JavaProgramaçãoOrientadaaoObjeto;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println("O Seu nome é: "+p.str);
        System.out.println("o ano de nascimento é: "+p.ano_nascimento);
        p.falar();
        p.ano();

        // Pessoa -> tipo do objeto (Classe)
        // p -> objeto que representa a classe pessoa
        // new pesoa(); -> O espaço de memoria que é reservado para o objeto p

    }
}
