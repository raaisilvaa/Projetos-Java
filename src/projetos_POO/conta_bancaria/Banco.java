package projetos_POO.conta_bancaria;

public class Banco {
   public static void main(String[] args) {
      // Agora o construtor de Conta recebe apenas o número da conta e o tipo.
      // O saldo inicial e o status (aberta/fechada) são gerenciados internamente pela classe Conta.
      Conta cliente1 = new Conta("202112", "CC");

      // Você pode chamar o método cadastro para ver as informações da conta
      cliente1.cadastro();

      // Exemplo de operações:
      cliente1.depositar(300);
      cliente1.pagarMensal();
      cliente1.sacar(50);
      cliente1.cadastro();

      Conta cliente2 = new Conta("30321", "CP");
      cliente2.depositar(100);
      cliente2.pagarMensal();
      cliente2.cadastro();
      cliente2.fecharConta(); // Não vai conseguir fechar porque tem saldo
      cliente2.sacar(530); // Vai sacar o que sobrou (100 + 150 - 20 = 230)
      cliente2.fecharConta(); // Agora consegue fechar
      cliente2.cadastro();

      // Testando um tipo de conta inválido
      System.out.println("\n--- Testando conta com tipo inválido ---");
      Conta clienteInvalido = new Conta("99999", "INVALIDO");
      clienteInvalido.cadastro();
      clienteInvalido.depositar(100); // Não deve permitir, pois a conta não foi aberta
   }
}