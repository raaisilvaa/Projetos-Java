package tomando_decisoes_codigo_projetos.exercicio3;

import java.util.Scanner;

public class OrdemCrescente {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite três números: ");
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();
    int numero3 = scanner.nextInt();

    scanner.close();

    // Verificação do primeiro número
    if (numero1 < numero2 && numero1 < numero3) {
      System.out.println(numero1);
      
      // Verificação da ordem dos outros dois números
      if (numero2 < numero3) {
        System.out.println(numero2);
        System.out.println(numero3);
      } else {
        System.out.println(numero3);
        System.out.println(numero2);
      }
    }

    // Verificação do segundo número
    if (numero2 < numero1 && numero2 < numero3) {
      System.out.println(numero2);

      // Verificação da ordem dos outros dois números
      if (numero1 < numero3) {
        System.out.println(numero1);
        System.out.println(numero3);
      } else {
        System.out.println(numero3);
        System.out.println(numero1);
      }
    }

    // Verificação do terceiro número
    if (numero3 < numero1 && numero3 < numero2) {
      System.out.println(numero3);

      // Verificação da ordem dos outros dois números
      if (numero1 < numero2) {
        System.out.println(numero1);
        System.out.println(numero2);
      } else {
        System.out.println(numero2);
        System.out.println(numero1);
      }
    } 
  }
}






