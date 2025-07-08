package projetos_POO.heranca.controle_remoto;

public class Marcas {
   public static void main(String[] args) {
      ControleRemoto hp = new ControleRemoto();

      hp.ligar();
      hp.play();
      hp.maisVolume();
      hp.pause();

      hp.ligarMudo();
      hp.desligarMudo();
      hp.maisVolume();
      hp.maisVolume();
      hp.maisVolume();
      hp.menosVolume();
      hp.pause();
      hp.abrirMenu();
      hp.fecharMenu();

   }
}
