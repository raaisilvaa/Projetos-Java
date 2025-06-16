package arrays_de_dados.buscar_elemento;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarElemento {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int[] numeros = {8, 15, 2, 4, 9, 11, 13};
      ArrayList<Integer> numeroEncontrado = new ArrayList<>();

      System.out.println("Digite o número a ser encontrado: ");
      int numeroDigitado = scanner.nextInt();

      boolean encontrado = false;
      for (int i = 0; i < numeros.length; i++) {
         if (numeros[i] == numeroDigitado) {
            encontrado = true;
            numeroEncontrado.add(numeros[i]);
         }
      }

      if (!numeroEncontrado.isEmpty()) {
         System.out.println("O número " + numeroDigitado + " foi encontrado.");
         System.out.println("---"); // Separador para clareza

         for (Integer indice : numeroEncontrado) {
            System.out.println("Na posição " + (indice + 1)); // Adiciona 1 a cada índice
         }

         System.out.println(); // Quebra de linha após listar as posições
         System.out.println("Ele apareceu " + numeroEncontrado.size() + " vez(es).");
      } else {
         System.out.println("O número " + numeroDigitado + " não foi encontrado no array.");
      }

      scanner.close();
   }
}
