package exercicio8;

import java.util.Scanner;

public class AnoBissexto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um ano: ");
    int ano = scanner.nextInt();

    if (ano % 400 == 0) {
      System.out.println("Bissexto");
    } else if (ano % 100 == 0) {
      System.out.println("Não é bissexto");
    } else if (ano % 4 == 0) {
      System.out.println("Bissexto");
    } else {
      System.out.println("Não é bissexto");
    }

    scanner.close();
  }
}
