import java.util.Arrays;
import java.util.Scanner;

public class AlgV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] n = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            n[i] = teclado.nextInt();
        }

        for(int j = n.length - 1; j >= 0; j--) {
            System.out.println(n[j]);
        }



        teclado.close();
    }
}
