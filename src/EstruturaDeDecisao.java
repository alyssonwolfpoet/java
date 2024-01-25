public class EstruturaDeDecisao {
    void media(Float nota){
        if (nota >= 7){
            System.out.println("Aluno aprovado");
        }else if(nota>=4&&nota<=6.99){
            System.out.println("O aluno esta de recuperação");
        }
        else {
            System.out.println("Alino está reprovado");
        }
    }
    public static void main(String[] args) {
        Float a =3.5f,b=6.5f,c=10f,d=8.0f;
        Float media= (a+b+c+d)/4;
        System.out.println("A Média do aluno é:" + media);
        new EstruturaDeDecisao().media(media);
    }
}
