package projetos_POO.conta_bancaria_minha_solucao;

public class Banco {
   public static void main(String[] args) {
      Conta cliente1 = new Conta(200154, "CP", "Gabriel Monteiro", 0.0);

      System.out.println("\n--- Abrindo a conta do Cliente 1 ---");
      cliente1.abrirConta(); // ESTA CHAMADA VAI MUDAR O STATUS PARA TRUE.
      cliente1.depositar(550);
      cliente1.pagarMensal();
      cliente1.sacar(129.99);
      cliente1.getSaldo();
      System.out.println(cliente1);
   }
}
