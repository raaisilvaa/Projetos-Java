package projetos_treino;

import java.util.Scanner;

/*
 * Lógica de programação do exercício.
 * Calcular média de notas dos alunos.
 * 
 * 1- Entrada de dados do usuário e leitura.
 * 2- Casting(conversão de valores) e soma dos resultados.  
 * 3- Mostrar o resultado de cada nota. 
 * 
 */

public class MediaAritmetica {
  public static void main(String[] args) {
    // Entrada de dados do usuário e leitura
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota");
    double primeiraNota = scanner.nextDouble();
    System.out.println("Digite a segunda nota");
    double segundaNota = scanner.nextDouble();
    System.out.println("Digite a terceira nota");
    double terceiraNota = scanner.nextDouble();
    
    scanner.close();

    // Casting(conversão de valores) e soma dos resultados. 
    double somaNotas = (primeiraNota + segundaNota + terceiraNota ) / 3;
    
    System.out.printf("Média das notas: %.1f", somaNotas);
  }
}