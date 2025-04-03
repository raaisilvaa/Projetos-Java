package projetos_conhecendo_a_base.conversor_dolar_real;

import java.util.Scanner;

public class Conversor_Dolar_Real {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Valor em dólar ");
    double valorDinheiro = scanner.nextDouble();
    System.out.println("Cotação do Dólar: ");
    double cotacaoDolar = scanner.nextDouble();


    scanner.close();

    double conversorDolarReal = valorDinheiro / cotacaoDolar;

    System.out.printf("Valor em Dólar: %f\n Cotação do Dólar: %f\n É igual a: %.2fR$", valorDinheiro, cotacaoDolar, conversorDolarReal);
  }
}
