package projetos_arrays_dados.agenda_compromissos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaDeCompromissos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Armazenamento dos dias da semana em um array
    ArrayList<String>[] agendaSemanal = new ArrayList[7];

    for (int i = 0; i < agendaSemanal.length; i++) {
      agendaSemanal[i] = new ArrayList<>();
    }

    int diaDaSemana;

    while (true) {
      System.out.println("\nQual o número do dia da semana que quer agendar um compromisso (0 sair, 8 mostrar a semana)?");
      diaDaSemana = scanner.nextInt();
      scanner.nextLine(); // Consumir a quebra de linha

      if (diaDaSemana == 0) {
        System.out.println("Programa finalizado!");
        break;
      }

      switch (diaDaSemana) {
        case 1:
          System.out.println("Segunda:");
          agendaSemanal[0].add(scanner.nextLine());
          break;
        case 2:
          System.out.println("Terça:");
          agendaSemanal[1].add(scanner.nextLine());
          break;
        case 3:
          System.out.println("Quarta:");
          agendaSemanal[2].add(scanner.nextLine());
          break;
        case 4:
          System.out.println("Quinta:");
          agendaSemanal[3].add(scanner.nextLine());
          break;
        case 5:
          System.out.println("Sexta:");
          agendaSemanal[4].add(scanner.nextLine());
          break;
        case 6:
          System.out.println("Sábado:");
          agendaSemanal[5].add(scanner.nextLine());
          break;
        case 7:
          System.out.println("Domingo:");
          agendaSemanal[6].add(scanner.nextLine());
          break;
        case 8:
          String[] diasSemanais = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
          for (int i = 0; i < diasSemanais.length; i++) {
            System.out.println(diasSemanais[i] + ":");

            if (agendaSemanal[i].isEmpty()) {
              System.out.println("(Sem compromissos)");
            } else {
              for (String compromisso : agendaSemanal[i]) {
                System.out.println("- " + compromisso);
              }
            }
            System.out.println();
          }
          break;
        default:
          System.out.println("Dia inválido. Digite um número de 1 a 7, 8 para exibir ou 0 para sair.");
          break;
      }
    }

    scanner.close();
  }
}
