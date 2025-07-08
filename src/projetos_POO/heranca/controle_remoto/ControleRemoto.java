package projetos_POO.heranca.controle_remoto;

public class ControleRemoto implements Controlador {
   private int volume;
   private boolean ligado;
   private boolean tocando;
   private final int MIN_VOLUME = 0;
   private final int MAX_VOLUME = 100;

   public ControleRemoto() {
      this.volume = 50;
      this.ligado = false;
      this.tocando = false;
   }

   public int getVolume() {
      return volume;
   }

   public void setVolume(int volume) {
      this.volume = volume;
   }

   public boolean isLigado() {
      return ligado;
   }

   public void setLigado(boolean ligado) {
      this.ligado = ligado;
   }

   public boolean isTocando() {
      return tocando;
   }

   public void setTocando(boolean tocando) {
      this.tocando = tocando;
   }

   @Override
   public void ligar() {
      if (!this.isLigado()) {
         this.setLigado(true);
         System.out.println("Ligando o dispositivo...");
      } else {
         System.out.println("O dispositivo já está ligado.");
      }
   }

   @Override
   public void desligar() {
      if (this.isLigado()) {
         this.setLigado(false);
         this.setTocando(false);
         System.out.println("Desligando o dispositivo...");
      } else {
         System.out.println("O dispositivo já está desligado.");
      }
   }

   @Override
   public void abrirMenu() {
      if (this.isLigado() && !this.isTocando()) {
         System.out.println("\n----- MENU -----");
         System.out.println("Está ligado? " + (this.isLigado() ? "SIM" : "NÃO"));
         System.out.println("Está tocando? " + (this.isTocando() ? "SIM" : "NÃO"));
         System.out.print("Volume: " + this.getVolume() + " "); // Adicionei o Volume==

         for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|" );
         }

         System.out.println();
         System.out.println("-----------------"); // Linha de fechamento do menu
      } else if (!this.isLigado()) {
         System.out.println("Não é possível abrir o menu: O dispositivo está desligado.");
      } else { // Aqui ligado é true
         System.out.println("Não é possível abrir o menu enquanto está reproduzindo.");
      }
   }

   @Override
   public void fecharMenu() {
      if (this.isLigado() && !this.isTocando()) {
         System.out.println("Fechando Menu.");
      } else if (!this.isLigado()) {
         System.out.println("Não há menu para fechar: O dispositivo está desligado.");
      } else {
         System.out.println("Não é possível fechar o menu enquanto está reproduzindo.");
      }
   }

   @Override
   public void maisVolume() {
      if (this.isLigado()) {
         if (this.getVolume() <= MAX_VOLUME) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentando volume para " + this.getVolume());
         } else {
            System.out.println("Volume já está no máximo (100).");
         }
      } else {
         System.out.println("Não é possível aumentar o volume: O dispositivo está desligado.");
      }
   }

   @Override
   public void menosVolume() {
      if (this.isLigado()) {
         if (this.getVolume() > MIN_VOLUME) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Diminuindo volume para " + this.getVolume());
         } else {
            System.out.println("Volume já está no mínimo (0) ou mudo.");
         }
      } else {
         System.out.println("Não é possível diminuir o volume: O dispositivo está desligado.");
      }
   }

   @Override
   public void ligarMudo() {
      if (this.isLigado() && this.getVolume() > MIN_VOLUME) {
         this.setVolume(0);
         System.out.println("Mudo ativado!");
      } else if (!this.isLigado()) {
         System.out.println("Não é possível mutar: O dispositivo está desligado.");
      } else { // this.getVolume() == 0
         System.out.println("O dispositivo já está no mudo.");
      }
   }

   @Override
   public void desligarMudo() {
      if (this.isLigado() && this.getVolume() == MIN_VOLUME) {
         this.setVolume(50);
         System.out.println("Mudo desativado! Volume restaurado para " + this.getVolume());
      } else if (!this.isLigado()) {
         System.out.println("Não é possível desmutar: O dispositivo está desligado.");
      } else { // this.getVolume() > 0
         System.out.println("O dispositivo já está no mudo.");
      }
   }

   @Override
   public void play() {
      if (this.isLigado() && !this.isTocando()) {
         this.setTocando(true);
         System.out.println("Iniciando reprodução...");
      } else if (!this.isLigado()){
         System.out.println("Não é possível reproduzir: O dispositivo está desligado.");
      } else {
         System.out.println("Já está reproduzindo.");
      }
   }

   @Override
   public void pause() {
      if (this.isLigado() && this.isTocando()) {
         this.setTocando(false);
         System.out.println("Pausando reprodução...");
      } else if (!this.isLigado()) {
         System.out.println("Não é possível pausar: O dispositivo está desligado.");
      } else {
         System.out.println("Não há nada para pausar.");
      }
   }

}

