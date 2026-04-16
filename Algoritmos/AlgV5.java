import java.util.Arrays;
import java.util.Scanner;

public class AlgV5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numero = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("\nDigite um número inteiro: ");
            numero[i] = teclado.nextInt();
            if (numero[i] % 2 == 0) {
                par[i] = numero[i];
            } else {
                impar[i] = numero[i];
            }
            System.out.println("Números digitados: " + numero[i]);
            System.out.println("Números pares: " + par[i]);
            System.out.println("Números ímpares: " + impar[i]);
            break;
        }


        teclado.close();
    }
}
