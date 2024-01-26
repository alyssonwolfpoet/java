public class Vetores_Letras_Nomes {
    public static void main(String[] args) {
        char letras[] = {'a', 'b', 'c', 'd', 'e'};
        Character letras_2[] = {'A', 'B','C', 'D','E'};
        for (int i = 0; i < 5;i++){
            System.out.println("Vetor de letras minusculas: "+ letras[i]+" - vetor de letras maiusculas: "+letras_2[i]);
        }
        System.out.println("_______________________________");
        char[] alfabeto = new char[26];
        char l = 'a';
        for (int i = 0;i<alfabeto.length;i++){
            alfabeto[i]=l;
            l++;
        }
        for (int i = 0; i < alfabeto.length;i++){
            System.out.print(alfabeto[i]+" ");
        }
        System.out.println("\n_______________________________");
        String nomes[] = {"Paulo","Rafael","Lana","Charles","Ludmila"};
        for (int i =0; i<nomes.length;i++){
            System.out.print(nomes[i] +" - ");
        }
    }
}
