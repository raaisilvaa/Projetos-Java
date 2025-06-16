package arrays_de_dados.projeto_cpf;

import java.util.Scanner;

public class CloneCPF {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      int[] digitosCPF = new int[9]; // Usando int, pois são dígitos de 0 a 9
      int[] multiplicadoresDV1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
      long somaPonderadaDV1 = 0; 

      System.out.println("Digite os 9 primeiros dígitos do seu CPF (somente números, sem pontos ou traços): ");

      String cpfDigitado = scanner.nextLine(); // Lê a linha inteira como uma string

      // --- VALIDAÇÃO DA ENTRADA ---
      if (cpfDigitado.length() != 9) {
         System.out.println("Erro: O CPF deve conter exatamente 9 dígitos.");
         scanner.close();
         return; // Encerra o programa
      }

      for (int i = 0; i < 9; i++) { // Loop para os 9 dígitos
         char digitoChar = cpfDigitado.charAt(i);

         // Verifica se o caractere é um dígito válido
         if (!Character.isDigit(digitoChar)) {
            System.out.println("Erro: O CPF deve conter apenas números. Caractere inválido: '" + digitoChar + "'");
            scanner.close();
            return;
         }

         int digitoNumerico = Character.getNumericValue(digitoChar); // Converte 'char' para 'int'

         digitosCPF[i] = digitoNumerico; // Armazena o dígito no array numérico

         // Calcula a soma ponderada: dígito atual * seu multiplicador correspondente
         somaPonderadaDV1 += (long) digitoNumerico * multiplicadoresDV1[i]; // Cast para long para garantir a operação
      }

      System.out.println("Soma Ponderada para DV1: " + somaPonderadaDV1);

      // --- CÁLCULO DO DV1 (continuando a lógica do seu problema) ---
      long restoDivisaoDV1 = somaPonderadaDV1 % 11;
      long primeiroDigitoVerificador;

      if (restoDivisaoDV1 < 2) { // Se o resto for 0 ou 1, o DV é 0
         primeiroDigitoVerificador = 0;
      } else { // Caso contrário, o DV é 11 - resto
         primeiroDigitoVerificador = 11 - restoDivisaoDV1;
      }

      System.out.println("Primeiro Dígito Verificador (DV1): " + primeiroDigitoVerificador);

      // --- PREPARAÇÃO PARA O CÁLCULO DO DV2 ---
      // Agora você precisa de um novo array (ou modificar o existente)
      // que inclua os 9 dígitos originais + o primeiro DV calculado.
      int[] digitosComDV1 = new int[10]; // Array para 10 dígitos (9 + DV1)
      for (int i = 0; i < 9; i++) {
         digitosComDV1[i] = digitosCPF[i]; // Copia os 9 dígitos originais
      }

      digitosComDV1[9] = (int) primeiroDigitoVerificador; // Adiciona o DV1

      // Multiplicadores para o cálculo do SEGUNDO Dígito Verificador (DV2)
      // Corresponde aos 10 dígitos (9 iniciais + DV1), de 11 a 2
      int[] multiplicadoresDV2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
      long somaPonderadaDV2 = 0;

      // Loop para calcular a soma ponderada para o DV2
      for (int i = 0; i < 10; i++) {
         somaPonderadaDV2 += (long) digitosComDV1[i] * multiplicadoresDV2[i];
      }

      System.out.println("Soma Ponderada para DV2: " + somaPonderadaDV2);

      // --- CÁLCULO DO DV2 ---
      long restoDivisaoDV2 = somaPonderadaDV2 % 11;
      long segundoDigitoVerificador;

      if (restoDivisaoDV2 < 2) { // Se o resto for 0 ou 1, o DV é 0
         segundoDigitoVerificador = 0;
      } else { // Caso contrário, o DV é 11 - resto
         segundoDigitoVerificador = 11 - restoDivisaoDV2;
      }

      System.out.println("Segundo Dígito Verificador (DV2): " + segundoDigitoVerificador);

      // --- EXIBIÇÃO DO CPF COMPLETO ---
      System.out.print("CPF Completo: ");
      for (int i = 0; i < 9; i++) {
         System.out.print(digitosCPF[i]);
      }

      System.out.print("-" + primeiroDigitoVerificador + "" + segundoDigitoVerificador);
      System.out.println();

      scanner.close();
   }
}
