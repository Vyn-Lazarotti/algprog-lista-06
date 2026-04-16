import java.util.Arrays;
import java.util.Scanner;

public class AlgV7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] num = new int[5];
        int[] soma = new int[1];
        int[] mult = new int[1];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nDigite um número inteiro: ");
            num[i] = teclado.nextInt();
            soma[i] += num[i];
            mult[i] *= num[i];
            System.out.println("Números digitados: " + num[i]);
            System.out.println("Soma: " + soma[i]);
            System.out.println("Multiplicação: " + mult[i]);
            break;
        }

        teclado.close();
    }
}
