import java.util.Arrays;
import java.util.Scanner;

public class AlgV1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] n = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número inteiro: ");
            n[i] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(n));


        teclado.close();
    }
}