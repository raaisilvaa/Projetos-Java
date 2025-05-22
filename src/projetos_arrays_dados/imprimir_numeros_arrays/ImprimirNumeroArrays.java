package projetos_arrays_dados.imprimir_numeros_arrays;

/*
 * Crie um programa que lê um número inteiro n que representa a quantidade de números a serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.

 * Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.
 */

import java.util.Scanner;

public class ImprimirNumeroArrays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de números que deseja inserir: ");
    // Lê a quantidade de números que o usuário irá digitar.
    int quantidade = scanner.nextInt();
    int[] numeros = new int[quantidade];

    // Loop para ler e armazenar os números
    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite o " + (i + 1) + "º número:");
      numeros[i] = scanner.nextInt();
    }

    // Loop para imprimir os números após todos terem sido lidos
    System.out.println("\n--- Números Digitados ---"); // Adiciona um cabeçalho para a saída
    for (int i = 0; i < quantidade; i++) {
      System.out.println(numeros[i]);
    }

    scanner.close();
  }
}
