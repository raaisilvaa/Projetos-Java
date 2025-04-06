package tomando_decisoes_codigo_projetos.exercicio2;

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou impar.
 */
public class Par_Impar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número: ");
    int numeroAvaliado = scanner.nextInt();
    scanner.close();

    int numeroParImpar = numeroAvaliado % 2;

    if (numeroParImpar == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
  }
}
