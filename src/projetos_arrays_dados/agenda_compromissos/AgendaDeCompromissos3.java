package projetos_arrays_dados.agenda_compromissos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaDeCompromissos3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<String>[] agendaSemanal = new ArrayList[7];
    String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

    for (int i = 0; i < agendaSemanal.length; i++) {
      agendaSemanal[i] = new ArrayList<>();
    }

    while (true) {
      System.out.println("\nDigite o número do dia da semana (1-Segunda a 7-Domingo, 8-Mostrar semana, 0-Sair):");
      int diaDaSemana = scanner.nextInt();
      scanner.nextLine(); // consumir quebra de linha

      if (diaDaSemana == 0) {
        System.out.println("Programa finalizado!");
        break;
      }
    
      // Mostrar compromissos da semana
      if (diaDaSemana == 8) {
        for (int i = 0; i < dias.length; i++) {
          System.out.println(dias[i] + ":");
          if (agendaSemanal[i].isEmpty()) {
            System.out.println("(Sem compromissos)");
          } else {
            for (String compromisso : agendaSemanal[i]) {
              System.out.println("- " + compromisso);
            }
          }
          System.out.println();
        }
        continue;
      }

      if (diaDaSemana >= 1 && diaDaSemana <= 7) {
        int indice = diaDaSemana - 1;
        System.out.println(dias[indice] + ": Digite o compromisso:");
        String compromisso = scanner.nextLine();
        agendaSemanal[indice].add(compromisso);
      } else {
        System.out.println("Dia inválido! Digite um número de 1 a 7, 8 para mostrar a semana ou 0 para sair.");
      }
    }

    scanner.close();
  }
}
