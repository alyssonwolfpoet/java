package JavaProgramaçãoOrientadaaoObjeto.programers;

public class Programadores {
    public static void main(String[] args) {
        System.out.println(Senioridade.JUNIOR+ " "+Senioridade.JUNIOR.getId());
        for (Senioridade s: Senioridade.values()){
            System.out.println("O programador: "+s+ " Deve ter "+s.getId()+" de anos de experiencia");
        }
    }
}
