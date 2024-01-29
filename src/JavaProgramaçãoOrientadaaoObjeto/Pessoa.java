package JavaProgramaçãoOrientadaaoObjeto;

public class Pessoa {
    public String str = "Alysson";
    public int ano_nascimento= 200;

    void falar(){
        System.out.println("Ola o meu nome é:" + str);
    }

    void ano(){
        System.out.println("eu nasci no ano:" +ano_nascimento);
    }
}
