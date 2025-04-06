package projetos_conhecendo_a_base.dias_em_anos;

import java.util.Scanner;

/*
 * Escreva um programa que leia uma idade em anos e imprima
 * essa idade em dias.
 * 
 * Ex: 1 ano => 365 dias de idade.
 * 
 * 1- Entrada de dados do usuário.
 * 2- Calcular a idade em dias.
 * 
 */
public class DiasDeIdade {
  public static void main(String[] args) {
    // Entrada de dados do usuário.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a sua idade: ");
    int numeroIdade = scanner.nextInt();
    scanner.close();

    // Calcular a idade em dias.
    int calculoIdadeEmDias = numeroIdade * 365;
    System.out.printf("%d", calculoIdadeEmDias);
  }
}
