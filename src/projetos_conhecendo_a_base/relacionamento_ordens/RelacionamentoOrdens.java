package projetos_conhecendo_a_base.relacionamento_ordens;

import java.util.Scanner;

public class RelacionamentoOrdens {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite dois números");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    scanner.close();

    System.out.println(num1 + "==" + num2 + "?" + (num1 == num2));
    System.out.println(num1 + "!=" + num2 + "?" + (num1 != num2));
    System.out.println(num1 + ">" + num2 + "?" + (num1 > num2));
    System.out.println(num1 + "<" + num2 + "?" + (num1 < num2));
    System.out.println(num1 + ">=" + num2 + "?" + (num1 >= num2));
    System.out.println(num1 + "<=" + num2 + "?" + (num1 <= num2));
  }
}
