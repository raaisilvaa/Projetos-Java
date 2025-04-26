package repetindo_instrucoes.exercicio5;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int fatorial = scanner.nextInt();
    int resultado = 1;

    for (int i = 1; i <= fatorial; i++) {
      resultado *= i; // resultado = resultado * i
    }

    System.out.println(resultado);
    scanner.close();
  }
}
