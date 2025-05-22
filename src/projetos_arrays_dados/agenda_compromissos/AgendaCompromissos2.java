package projetos_arrays_dados.agenda_compromissos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaCompromissos2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Armazenamento de arrays para os dias da semana
    ArrayList<String>[] agendaDaSemana = new ArrayList[7];

    // Loop para iterar o indice aos dias da semana (são 7 dias, o indice começa em 0, 0 a 6)
    for (int i = 0; i < agendaDaSemana.length; i++) {
      agendaDaSemana[i] = new ArrayList<>();
    }

    // Declarando a variável para guardar os dias da semana
    int diaDaSemana;
    // Loop para caso o usuário digitar zero e assim encerrar o programa.
    while (true) {
      System.out.println("\nQual o número do dia da semana que quer agendar um compromisso (0 sair, 8 mostrar a semana)?");
      diaDaSemana = scanner.nextInt();
      scanner.nextLine(); // Consumir a quebra de linha

      if (diaDaSemana == 0) {
        System.out.println("Programa finalizado!");
        break;
      }

      // Criando condição para caso o usuário digitar 8 e mostrar todas as tarefas de cada dia
      if (diaDaSemana == 8) {
        // Criando váriavel para mostrar em forma de letras e não índice.
        String[] diasSemanais = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        for (int i = 0; i < diasSemanais.length; i++) {
          System.out.println(diasSemanais[i] + ":");

          // Esse [i] dentro do agendaDaSemana, representa os diasSemanais
          if (agendaDaSemana[i].isEmpty()) {
            System.out.println("(Sem compromissos)");
          } else {
            // Esse [i] dentro do agendaDaSemana, representa os diasSemanais
            for (String compromisso : agendaDaSemana[i]) {
              System.out.println("- " + compromisso);
            }
          }

          System.out.println(); // Espaço entre os dias4
        }

        continue; // Volta ao início do loop
      }

      // Criando um switch para as opções que o usuário digitar e armazenando o as tarefas na nova variável
      String tarefa;
      switch (diaDaSemana) {
        case 1:
          System.out.println("Segunda");
          tarefa = scanner.nextLine();
          agendaDaSemana[0].add(tarefa);
          break;
        case 2:
          System.out.println("Terça");
          tarefa = scanner.nextLine();
          agendaDaSemana[1].add(tarefa);
          break;
        case 3:
          System.out.println("Quarta");
          tarefa = scanner.nextLine();
          agendaDaSemana[2].add(tarefa);
          break;
        case 4:
          System.out.println("Quinta");
          tarefa = scanner.nextLine();
          agendaDaSemana[3].add(tarefa);
          break;
        case 5:
          System.out.println("Sexta");
          tarefa = scanner.nextLine();
          agendaDaSemana[4].add(tarefa);
          break;
        case 6:
          System.out.println("Sábado");
          tarefa = scanner.nextLine();
          agendaDaSemana[5].add(tarefa);
          break;
        case 7:
          System.out.println("Domingo");
          tarefa = scanner.nextLine();
          agendaDaSemana[6].add(tarefa);
          break;
        default:
          System.out.println("Dia inválido. Digite um número de 1 a 7, 8 para exibir ou 0 para sair.");
          break;
      }
    }

    scanner.close();
  }
}




// String[] agendaDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
