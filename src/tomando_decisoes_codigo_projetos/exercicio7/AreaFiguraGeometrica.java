package tomando_decisoes_codigo_projetos.exercicio7;

import java.util.Scanner;

public class AreaFiguraGeometrica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in, "UTF-8");

    System.out.println("Qual a figura geométrica? ");
    String figuraGeometrica = scanner.next();

        
    String areaTexto = switch (figuraGeometrica.toLowerCase()) {
      case "retangulo" -> {
        System.out.println("Digite a base:");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();
        double resultado = base * altura;
        yield String.format("%.1f", resultado); // Formata o resultado para uma casa decimal e retorna como String
      }

      case "triangulo" -> {
        System.out.println("Digite a base:");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();
        double resultado = (base * altura) / 2;
        yield String.format("%.1f", resultado); // Formata o resultado para uma casa decimal e retorna como String
      }

      case "circulo" -> {
        System.out.println("Digite o raio:");
        double raio = scanner.nextDouble();
        double pi = 3.14;
        double resultado = pi * (raio * raio);
        yield String.format("%.1f", resultado); // Formata o resultado para uma casa decimal e retorna como String
      }
      default -> "error";
  };

  System.out.println("A área da figura é: " + areaTexto);

  scanner.close();
    
    
  }
}




// System.out.println("Digite a base x altura");
// double base = scanner.nextInt();
// double altura = scanner.nextInt();
// double resultado = base * altura;
// System.out.println("%.1f ");