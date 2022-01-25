import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a nota 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Escreva a nota 2: ");
        double n2 = sc.nextDouble();
        System.out.println("Escreva a nota 3: ");
        double n3 = sc.nextDouble();
        System.out.println("Escreva a nota 4: ");
        double n4 = sc.nextDouble();

        double media = BigDecimal.valueOf(((2 * n1) + (3 * n2) + (4 * n3) + (1 * n4)) / 10)
                .setScale(1, RoundingMode.HALF_DOWN)
                .doubleValue();

        if (media >= 7.0) {
            String tudoA = String.format("Media: %.1f", media);
            System.out.println(tudoA);
            System.out.println("Aluno aprovado");
        }

        if (media >= 5.0 && media <= 6.9) {
            String tudoA = String.format("Media: %.1f", media);
            System.out.println(tudoA);
            System.out.println("Aluno em exame");
            System.out.println("Escreva a nota do exame: ");
            double exame = sc.nextDouble();
            double novaMedia = (media + exame) / 2;

            if (novaMedia >= 5.0) {
                System.out.println("Nota do exame: " + exame);
                System.out.println("Aluno aprovado");
                String tudoF = String.format("Media final: %.1f", novaMedia);
                System.out.println(tudoF);
            }
            if (novaMedia < 5.0) {
                System.out.println("Nota do exame: " + exame);
                System.out.println("Aluno reprovado");
                String tudoN = String.format("Media: %.1f", media);
                System.out.println(tudoN);
            }

        }

        sc.close();

        if (media < 5.0) {
            String tudoA = String.format("Media: %.1f", media);
            System.out.println(tudoA);
            System.out.println("Aluno reprovado");
        }

    }

}
