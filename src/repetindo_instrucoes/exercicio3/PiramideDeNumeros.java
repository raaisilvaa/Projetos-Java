package repetindo_instrucoes.exercicio3;

/*
  Pirâmide de números

  Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5) e gera um padrão de números crescentes da seguinte forma:

    1
    12
    123
    1234
    12345
 */

public class PiramideDeNumeros {
  public static void main(String[] args) {
    int numeroDeLinhas = 5;

    for (int linha = 1; linha <= numeroDeLinhas; linha++) {

      for (int coluna = 1; coluna <= linha; coluna++) {
        System.out.print(coluna);
      }

      System.out.println();
    }
  }
}
