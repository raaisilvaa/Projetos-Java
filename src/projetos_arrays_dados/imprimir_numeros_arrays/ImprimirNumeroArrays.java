package projetos_arrays_dados.imprimir_numeros_arrays;

/*
 * Crie um programa que lê um número inteiro n que representa a quantidade de números a serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.

 * Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.
 */

import java.util.Scanner;

public class ImprimirNumeroArrays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Lê a quantidade de números que o usuário irá digitar.
    int quantidade = scanner.nextInt();
    int[] numeros = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
      // Lê cada um dos números digitados pelo usuário e armazena no array.
      numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < quantidade; i++) {
      System.out.println(numeros[i]);
    }

    scanner.close();
  }
}
