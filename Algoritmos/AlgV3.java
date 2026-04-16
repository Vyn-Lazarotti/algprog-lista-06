import java.util.Arrays;
import java.util.Scanner;

public class AlgV3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] nota = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("\nDigite a nota: ");
            nota[i] = teclado.nextDouble();
            soma += nota[i];
        }

        System.out.println("Processando...");
        System.out.println("Primeira nota: " + nota[0]);
        System.out.println("Segunda nota: " + nota[1]);
        System.out.println("Terceira nota: " + nota[2]);
        System.out.println("Quarta nota: " + nota[3]);

        double media = soma / nota.length;
        System.out.println("Média final: " + media);

        teclado.close();
    }
}

