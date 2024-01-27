package AtividadesPráticas;

public class Tarefa1 {
    public static void main(String[] args) {
        float notas[] = {10f,6f,8f,9f,4f,8f,5f,4f,10f,9f,10f};
        float media = 0;
        for (int i = 0; i<notas.length;i++){
            media += notas[i];
        }
        float mediaGlobal = media/10;
        System.out.println("SOma das notas: "+media+" media: "+mediaGlobal);
        if (mediaGlobal >=9.5 && mediaGlobal <=10){
            System.out.println("Estudante com desempenho espetacular");
        } else if (mediaGlobal >7 && mediaGlobal <9.5) {
            System.out.println("Estudante com desempenho ótimo");
        } else if (mediaGlobal >5 && mediaGlobal <7) {
            System.out.println("Estudante com desempenho favorável");
        } else if (mediaGlobal>5) {
            System.out.println("studante,\n" +
                    "refaça algumas disciplinas e melhore sua média ");
        }
    }
}
