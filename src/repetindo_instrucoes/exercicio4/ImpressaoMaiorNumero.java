package repetindo_instrucoes.exercicio4;

/*
  Imprimindo o maior número

  Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar um número negativo, o programa irá encerrar e imprimir o maior número entre os digitados. Você deve utilizar estruturas de repetição para coletar os números e determinar qual é o maior.

  Ex: Suponha que o usuário insira os seguintes números: 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.


Importante: Imprima apenas o maior número e nenhum texto adicional!
 */

import java.util.Scanner;

public class ImpressaoMaiorNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maior = 0;
    int numero;

    do {
      System.out.println("Digite alguns números(número negativo encerra o programa): ");
      numero = scanner.nextInt();

      if (numero >= 0) {
        
        if (numero > maior) {
          maior = numero;
        }
      }

    } while (numero >= 0);

    System.out.println(maior);

    scanner.close();
  }
}
