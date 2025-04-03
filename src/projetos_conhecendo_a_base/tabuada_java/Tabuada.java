package projetos_conhecendo_a_base.tabuada_java;
/*
 * 1- Ler um número.
 * 2- Imprimir sua tabuada.
 */

import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    // Ler um número.
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numeroTabuada = scanner.nextInt();
    
    scanner.close();

    // Imprimir sua tabuada.
    System.out.println(numeroTabuada + "x 0 = " + (0 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 1 = " + (1 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 2 = " + (2 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 3 = " + (3 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 4 = " + (4 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 5 = " + (5 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 6 = " + (6 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 7 = " + (7 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 8 = " + (8 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 9 = " + (9 * numeroTabuada) );
    System.out.println(numeroTabuada + "x 10 = " + (10 * numeroTabuada) );
    
  }
}
