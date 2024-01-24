public class Funcao {
    // Com retorno. - Tipo de dados - com ou sem parãmentos
    // sem retorno. - Void - com Parâmetros ou sem parâmetros

    void Hello(){ // Função sem retorno e sem parâmetros
        System.out.println("Olá!");
    }

    void Hello(String nome){// Função sem retorno e com paramentos
        System.out.println("Ola, "+nome+"!");
    }

    String chegada(){// Função com retorno e sem parâmetros
        return "Olá!!!";
    }

    String chegada(String nome){ //Função com retorno e com parâmetros
        return "Ola, "+nome+"!!";
    }
    int sum(int n1, int n2){
        Hello();
        return n1+n2;
    }
    public static void main(String[] args) {
        new Funcao().Hello();
        new Funcao().Hello("Alysson");
        String x = new Funcao().chegada();
        System.out.println(x);
        String y = new Funcao().chegada("Alysson");
        System.out.println(y);
        Integer z = new Funcao().sum(10,20);
        System.out.println(z);
    }
}
