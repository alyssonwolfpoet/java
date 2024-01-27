package AtividadesPráticas;

public class Tarefa7 {
    public static void main(String[] args) {
        // Número do tipo float a ser convertido
        float numero = 3.75f;

// Separar a parte inteira da parte decimal
        int parteInteira = (int) numero; // 3
        float parteDecimal = numero - parteInteira; // 0.75

// Converter a parte inteira em horas
        int horas = parteInteira; // 3

// Converter a parte decimal em minutos
        int minutos = Math.round(parteDecimal * 60); // 45

// Imprimir o resultado
        System.out.println("O número " + numero + " equivale a " + horas + " horas e " + minutos + " minutos.");

    }
}
