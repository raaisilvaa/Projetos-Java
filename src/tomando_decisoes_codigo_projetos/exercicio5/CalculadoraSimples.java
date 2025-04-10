package tomando_decisoes_codigo_projetos.exercicio5;

import java.util.Scanner;

public class CalculadoraSimples {
  public static void main(String[] args) {
    // Entrada de Dados
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculdadora: ");
    double numero1 = scanner.nextDouble();
    String operadores = scanner.next();
    double numero2 = scanner.nextDouble();

    switch (operadores) {
      case "+":
        double adição = numero1 + numero2;
        System.out.println(adição);
        break;
      case "-":
        double subtracao = numero1 - numero2;
        System.out.println(subtracao);
        break;
      case "/":
        double divisão = numero1 / numero2;
        System.out.println(divisão);
        break;
      case "*":
        double multiplicacao = numero1 * numero2;
        System.out.println(multiplicacao);
        break;
      default:
        System.out.println("Símbolo inválido digitado.");
        break;
    }

    scanner.close();
  }
}
