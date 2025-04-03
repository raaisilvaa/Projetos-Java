package projetos_conhecendo_a_base.saudacao_console;

import java.io.Console;

public class SaudacaoConsole {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Qual o seu nome? ");
    String nome = console.readLine();
    System.out.println("Olá, " + nome);
  }
}
