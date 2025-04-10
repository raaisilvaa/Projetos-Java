package tomando_decisoes_codigo_projetos.exercicio4;

import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categoria:
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */

public class CategoriaAtleta {
  public static void main(String[] args) {
    // Entrada de idades pelo usuário
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a idade do atleta: ");
    int idade = scanner.nextInt();
    
    scanner.close();

    // Verificação de categoria
    if (idade >= 10 && idade <= 12) {
      System.out.println("Categoria Mirim");
    } else if (idade >= 13 && idade <= 15) {
      System.out.println("Categoria Infantil");
    } else if (idade >= 16 && idade <= 18) {
      System.out.println("Categoria Juvenil");
    } else {
      System.out.println("Categoria Inválida");
    }

  }
}
