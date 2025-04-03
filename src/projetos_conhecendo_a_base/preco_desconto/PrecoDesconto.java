package projetos_conhecendo_a_base.preco_desconto;

import java.util.Scanner;

public class PrecoDesconto {
  public static void main(String[] args) {
    // Ler preço e ler desconto.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o preço: ");
    double preco = scanner.nextDouble();
    System.out.println("Digite o desconto ");
    int desconto = scanner.nextInt();

    scanner.close();

    // Calcular o valor do desconto
    double valorDesconto = preco * (desconto / 100.0);
    // Calcular o preço com desconto
    double precoComDesconto = preco - valorDesconto;

    System.out.printf("%.2f reais com %d%% de desconto.\n O preço com desconto é de %.2f e o valor economizado foi de %.2f reais.", preco, desconto, precoComDesconto, valorDesconto);
  }
}
