import java.util.Arrays;
import java.util.Scanner;

public class AlgV4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int count = 0;
        String[] word = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma letra: ");
            word[i] = teclado.nextLine();
            if (word[i] != "a" || word[i] != "e" || word[i] != "i" || word[i] != "o" || word[i] != "u") 
            {
                count += 1;
                System.out.println("Número de consoantes: " + count);
                System.out.println("Consoantes digitadas: " + word[i]);
            }
        }




        teclado.close();
    }
}
