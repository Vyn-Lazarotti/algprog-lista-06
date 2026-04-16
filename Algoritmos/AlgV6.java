import java.util.Arrays;
import java.util.Scanner;

public class AlgV6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] aluno = new String[10];
        double[] nota = new double[4];
        double[] media = new double[4];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno: ");
            aluno[i] = teclado.nextLine();
            for (int j = 0; j < 4; j++){
                System.out.println("\nNota: ");
                nota[i] = teclado.nextDouble();
                media[i] += nota[i] / 4;
                if (media[i] >= 7) {
                    count += 1;
                    System.out.println("Número de alunos que passaram: " + count);
                } else {
                    break;
                }
            }
        }

        teclado.close();
    }
}