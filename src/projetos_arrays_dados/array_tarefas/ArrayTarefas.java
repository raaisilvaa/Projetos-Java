package projetos_arrays_dados.array_tarefas;

/*
  ? O programa permite que até 10 tarefas sejam cadastradas.

  ? Serão exibidas 3 opções: 1. Cadastrar tarefa, 2. Listar tarefas e 3. Sair

  ? Caso seja selecionada a opção 1, deve ler o número da tarefa (entre 1 e 10) e depois a tarefa em si, que será cadastrada na posição do array equivalente ao número da tarefa fornecido (ex: 0 no array é a primeira posição, 1 é a segunda, ...).

  ? Caso seja selecionada a opção 2, deve imprimir todas as tarefas encontradas no formato: 

  * Tarefa 1 - gfwgjf
  * Tarefa 2 - kfhwekfjwhe

  ? Caso seja selecionada qualquer outra opção, o programa deve imprimir "Encerrando programa..." e deverá encerrar.
 */

import java.util.Scanner;

public class ArrayTarefas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] tarefas = new String[10];
    int opcao;

    do {
      System.out.println("\nMenu de opções: ");
      System.out.println("1 - Cadastrar tarefa:");
      System.out.println("2 - Listar tarefas");
      System.out.println("3 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine(); // Consome a quebra de linha

      switch (opcao) {
        case 1:
          System.out.print("Digite o número da tarefa (1 a 10): ");
          int numeroTarefa = scanner.nextInt();
          scanner.nextLine(); // Consome a quebra de linha

          if (numeroTarefa >= 1 && numeroTarefa <= 10) {
            int indice = numeroTarefa - 1;
            System.out.print("Digite a descrição da tarefa: ");
            String descricaoTarefa = scanner.nextLine();
            tarefas[indice] = descricaoTarefa;
            System.out.println("Tarefa " + numeroTarefa + " cadastrada com sucesso!");
          } else {
            System.out.println("Número da tarefa inválido. Digite um número entre 1 e 10.");
          }
          break;
        case 2:
          System.out.println("\nLista de Tarefas:");
          boolean encontrouTarefa = false;
          for (int i = 0; i < tarefas.length; i++) {
            if (tarefas[i] != null) {
              System.out.println("Tarefa " + (i + 1) + " - " + tarefas[i]);
              encontrouTarefa = true;
            }
          }
          if (!encontrouTarefa) {
            System.out.println("Nenhuma tarefa cadastrada.");
          }
          break;
        case 3:
          System.out.println("Encerrando programa...");
          break;
        default:
          System.out.println("Opção inválida. Digite 1, 2 ou 3.");
          break;
      }
    } while (opcao != 3); // Loop continua enquanto a opção não for 3 (Sair)

    scanner.close();
  }
}