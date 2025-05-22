package projetos_arrays_dados.comparando_arrays_numeros;

import java.util.Scanner;

/*
 * Crie um programa que lê 2 números, depois dois arrays de números com os        tamanhos informados anteriormente e ao final imprime os números comuns que aparecem em ambos os arrays.
 */
public class ComparandoArraysNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    System.out.println("Digite o tamanho do primeiro array:");
    int tamanho1 = scanner.nextInt();
    System.out.println("Digite o tamanho do segundo array:");
    int tamanho2 = scanner.nextInt();

    int[] array1 = new int[tamanho1];
    int[] array2 = new int[tamanho2];

    System.out.printf("Informe %d números do array 1:%n", tamanho1);
    for (int i = 0; i < tamanho1; i++) {
      array1[i] = scanner.nextInt();
    }

    System.out.printf("Informe %d números do array 2:%n", tamanho2);
    for (int i = 0; i < tamanho2; i++) {
      array2[i] = scanner.nextInt();
    }

    for (int numero1 : array1) {
      for (int numero2 : array2) {
        if (numero1 == numero2) {
          System.err.println("Os números digitados iguais foram: " + numero2);
        }
      }
    }

    scanner.close();
  }
}
