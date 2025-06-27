package projetos_POO.barbearia;

public class BarbeariaApp {
   public static void main(String[] args) {
      Atendimento cliente1 = new Atendimento("Elton", "Corte e barba");
      Atendimento cliente2 = new Atendimento("Rafael", "Corte");
      Atendimento cliente3 = new Atendimento("Roberto", "Corte");
      

      cliente1.registrarPagamento(100.00);
      System.out.println(cliente1.toString());

      cliente2.registrarPagamento(20.00);
      System.out.println(cliente2.toString());

      cliente3.registrarPagamento(40.00);
      System.out.println(cliente3.toString());


   }
}
