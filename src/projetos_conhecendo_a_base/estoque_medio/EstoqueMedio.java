package projetos_conhecendo_a_base.estoque_medio;

import java.util.Scanner;

public class EstoqueMedio {
  public static void main(String[] args) {
  // Entrada de valores e leitura.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o estoque mínimo: ");
    int quantidadeMinima = scanner.nextInt();
    System.out.println("Digite o estoque máximo: ");
    int quantidadeMaxima = scanner.nextInt();

    scanner.close();

  // Cálculo do estoque.
    int quantidadeMedia = (quantidadeMinima + quantidadeMaxima) / 2;

    System.out.printf("Estoque mínimo: %d\n Estoque máximo: %d\n O estoque médio é de: %d", quantidadeMinima, quantidadeMaxima, quantidadeMedia);
  }
}
