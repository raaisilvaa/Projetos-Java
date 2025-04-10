package tomando_decisoes_codigo_projetos.exercicio1;

import java.util.Scanner;

/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */
public class Aprovado_Reprovado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();

    double somaNotas = (nota1 + nota2 + nota3) / 3;
    int notaAprovado = 7;

    if (somaNotas >= notaAprovado) {
      System.out.printf("Nota: %.1f\nAprovado!", somaNotas);
    } else {
      System.out.printf("Nota: %.1f\nReprovado!", somaNotas);
    }

  }
}
