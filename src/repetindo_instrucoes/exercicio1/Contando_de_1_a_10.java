package repetindo_instrucoes.exercicio1;

/*
 * Escreva um programa Java que imprime números de 1 à 10 utilizando a estrutura de repetição while. O programa deve imprimir cada número em uma linha diferente.
 */

public class Contando_de_1_a_10 {
  public static void main(String[] args) {
    int contador = 1;

    while (contador <= 10) {
      System.out.println(contador);
      contador++;
    }
  }
}
