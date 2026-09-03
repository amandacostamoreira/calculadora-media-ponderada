import java.util.Scanner;
import java.util.Locale;

public class CalculadoraMediaPonderada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 0;
        double somaDasMedias = 0.0;

        System.out.println("calculadora de media ponderada ");
        System.out.println("digite \"-1\" no campo nome para encerrar o programa.\n");

        while (true) {
            System.out.print("nome do aluno: ");
            String nome = scanner.nextLine();

            if (nome.equals("-1")) {
                break;
            }

            System.out.print("nota do 1 bimestre: "); //peso 1
            double nota1 = scanner.nextDouble();

            System.out.print("nota do 2 bimestre: "); //peso 2
            double nota2 = scanner.nextDouble();
            scanner.nextLine(); //descarta o enter q sobrou do nextdouble, pra nao pular o proximo nextline

            double mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;

            System.out.printf(Locale.US, "media ponderada de %s: %.2f%n%n", nome, mediaPonderada);

            totalAlunos++;
            somaDasMedias += mediaPonderada;
        }

        System.out.println("\n resultado final");
        System.out.println("total de alunos cadastrados: " + totalAlunos);

        if (totalAlunos > 0) {
            double mediaGeral = somaDasMedias / totalAlunos;
            System.out.printf(Locale.US, "media geral da turma: %.2f%n", mediaGeral);
        } else {
            System.out.println("nenhum aluno foi cadastrado.");
        }

        scanner.close();
    }
}
