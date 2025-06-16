package arrays_de_dados.batalha_naval;

import java.util.Scanner;

public class BatalhaNaval {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Matriz visível para o jogador (mostra água, acertos e erros)
      char[][] tabuleiroVisivel = new char[5][5];
      // Matriz secreta que contém a localização dos navios
      char[][] tabuleiroSecreto = new char[5][5];

      int tentativasRestantes = 10;
      int naviosParaAfundar = 3; // Renomeado para seguir a lógica descrita

      // Inicializar ambas as matrizes com '~' (água)
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            tabuleiroVisivel[i][j] = '~';
            tabuleiroSecreto[i][j] = '~';
         }
      }

      System.out.println("Bem-vindo ao jogo de Batalha Naval!");
      System.out.println("Você tem 10 tentativas para afundar 3 navios.");

      // --- Fase de posicionamento dos navios ---
      System.out.println("\n--- Posicionamento dos Navios Secretos ---");
      System.out.println("Digite as posições (linha e coluna de 0 a 4) para 3 navios.");

      // Loop para posicionar 3 navios, com validação básica
      for (int i = 1; i <= naviosParaAfundar; i++) {
         int linha, coluna;
         boolean posicaoValida;
         do {
            posicaoValida = true; // Assume que a posição é válida até que se prove o contrário
            System.out.printf("Navio %d (linha coluna): ", i);
            linha = scanner.nextInt();
            coluna = scanner.nextInt();

            if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
               System.out.println("Posição fora do tabuleiro! Digite valores entre 0 e 4.");
               posicaoValida = false;
            } else if (tabuleiroSecreto[linha][coluna] == 'N') {
               System.out.println("Já existe um navio nesta posição. Escolha outra!");
               posicaoValida = false;
            }
         } while (!posicaoValida);

         tabuleiroSecreto[linha][coluna] = 'N'; // Coloca o navio na matriz secreta
      }
      System.out.println("Navios posicionados. Que comece a batalha!\n");


      // --- Fase principal do jogo ---
      while (tentativasRestantes > 0 && naviosParaAfundar > 0) {
         // Exibir tabuleiro visível ao jogador
         System.out.println("   0 1 2 3 4"); // Índices das colunas
         for (int i = 0; i < 5; i++) {
            System.out.print(i + "  "); // Índice da linha (2 espaços para alinhar com identação 3)
            for (int j = 0; j < 5; j++) {
               System.out.print(tabuleiroVisivel[i][j] + " ");
            }
            System.out.println();
         }

         System.out.println("Tentativas restantes: " + tentativasRestantes);

         int linhaTiro, colunaTiro;
         boolean tiroValido; // Para validar a entrada do tiro
         do {
            tiroValido = true; // Assume que o tiro é válido no início da iteração

            System.out.print("Digite a linha e a coluna do seu tiro (0-4): ");
            linhaTiro = scanner.nextInt();
            colunaTiro = scanner.nextInt();

            if (linhaTiro < 0 || linhaTiro > 4 || colunaTiro < 0 || colunaTiro > 4) {
               System.out.println("Posição inválida. Digite valores entre 0 e 4.");
               tiroValido = false;
            } else if (tabuleiroVisivel[linhaTiro][colunaTiro] != '~') { // Já atirou aqui antes
               System.out.println("Você já atirou nesta posição (" + tabuleiroVisivel[linhaTiro][colunaTiro] + "). Tente novamente.");
               tiroValido = false;
            }
         } while (!tiroValido); // Continua pedindo enquanto o tiro não for válido


         // Lógica do tiro
         if (tabuleiroSecreto[linhaTiro][colunaTiro] == 'N') {
            System.out.println("BOOOOM! Você acertou um navio!");
            tabuleiroVisivel[linhaTiro][colunaTiro] = 'X'; // Marca 'X' no tabuleiro visível
            tabuleiroSecreto[linhaTiro][colunaTiro] = 'X'; // Marca 'X' no secreto para que não seja acertado novamente
            naviosParaAfundar--; // Um navio a menos para afundar
         } else {
            System.out.println("Água! Você errou o tiro.");
            tabuleiroVisivel[linhaTiro][colunaTiro] = 'O'; // Marca 'O' (erro) no tabuleiro visível
         }

         tentativasRestantes--; // Uma tentativa a menos a cada tiro válido
         System.out.println("------------");
      }

      // --- Fim do jogo ---
      System.out.println("\n--- FIM DE JOGO ---");
      // Exibir o tabuleiro final (para o jogador ver o resultado completo)
      System.out.println("Tabuleiro Final:");
      System.out.println("   0 1 2 3 4");
      for (int i = 0; i < 5; i++) {
         System.out.print(i + "  "); // Índice da linha (2 espaços para alinhar com identação 3)
         for (int j = 0; j < 5; j++) {
            // Aqui podemos mostrar o tabuleiro secreto, para revelar os navios restantes
            // ou simplesmente o visível, para mostrar só o que o jogador descobriu
            // Vou mostrar o visível, mas pode trocar para o secreto se quiser mostrar tudo
            System.out.print(tabuleiroVisivel[i][j] + " ");
         }
         System.out.println();
      }

      if (naviosParaAfundar == 0) {
         System.out.println("\nPARABÉNS! Você afundou todos os navios!");
      } else {
         System.out.println("\nVocê perdeu. Suas tentativas acabaram e alguns navios sobreviveram.");
      }

      scanner.close();
   }
}
