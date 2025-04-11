package tomando_decisoes_codigo_projetos.exercicio6;

import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu peso: ");
    int peso = scanner.nextInt();
    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    double resultado = (double) peso / (altura * altura);

    if (resultado <= 18.5) {
      System.out.println("Magreza");
    } else if (resultado >= 18.5 && resultado <= 24.9) {
      System.out.println("Normal");
    } else if (resultado >= 25 && resultado < 29.9) {
      System.out.println("Sobrepeso");
    } else if (resultado >= 30 && resultado < 39.9) {
      System.out.println("Obesidade");
    } else if (resultado >= 40) {
      System.out.println("Obesidade Grave");
    } else {
      System.out.println("Algo deu inválido!");
    }

    scanner.close();
  }
}
