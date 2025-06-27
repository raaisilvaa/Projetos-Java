package projetos_POO.conta_bancaria;

public class Conta {
   private String numeroConta;
   private String tipo; // "CC" para Conta Corrente, "CP" para Conta Poupança
   private double saldo;
   private boolean status; // true para aberta, false para fechada

   // Construtor
   // Ao criar uma conta, ela já é aberta com o tipo e um saldo inicial (se aplicável).
   public Conta(String numeroConta, String tipo) {
      this.numeroConta = numeroConta;
      this.saldo = 0.0; // Saldo inicial sempre 0.0 antes de aplicar qualquer bônus
      this.status = false; // A conta inicia como fechada e é aberta pelo método

      // Chama setTipo para validar e atribuir o tipo antes de tentar abrir
      // Se o tipo for inválido, setTipo vai imprimir uma mensagem e manter this.tipo como null
      this.setTipo(tipo);

      // Somente tenta abrir a conta se o tipo foi definido com sucesso
      if (this.tipo != null) {
         this.abrirConta(); // Chama abrirConta sem o parâmetro tipo, pois já está definido
      } else {
         System.out.println("Erro: Não foi possível criar a conta. Tipo de conta inválido fornecido.");
      }
   }

   // Getters
   public String getNumeroConta() {
      return numeroConta;
   }

   public String getTipo() {
      return tipo;
   }

   public double getSaldo() {
      return saldo;
   }

   public boolean isStatus() {
      return status;
   }

   // Setters
   public void setNumeroConta(String numeroConta) {
      this.numeroConta = numeroConta;
   }

   // O tipo de conta deve ser "CC" ou "CP"
   public void setTipo(String tipo) {
      if (tipo != null && (tipo.equalsIgnoreCase("CC") || tipo.equalsIgnoreCase("CP"))) {
         this.tipo = tipo.toUpperCase();
      } else {
         System.out.println("Tipo de conta inválido. Use 'CC' para Conta Corrente ou 'CP' para Conta Poupança.");
         this.tipo = null; // Garante que o tipo seja null se for inválido
      }
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }

   // Métodos de Operação
   // Alterado para não receber 'tipo' como parâmetro, pois o tipo já está na instância
   public void abrirConta() {
      if (this.status) {
         System.out.println("A conta já está aberta.");
         return;
      }
      if (this.tipo == null) {
         System.out.println("Não é possível abrir a conta: Tipo de conta não definido ou inválido.");
         return;
      }

      this.setStatus(true); // Abre a conta

      // Taxa de abertura ou depósito inicial conforme o tipo de conta
      if (this.tipo.equals("CC")) {
         this.saldo += 50; // Exemplo: Conta Corrente começa com R$50 de bônus
         System.out.println("Conta Corrente aberta com sucesso! Saldo inicial: R$" + String.format("%.2f", this.saldo));
      } else if (this.tipo.equals("CP")) {
         this.saldo += 150; // Exemplo: Conta Poupança começa com R$150 de bônus
         System.out.println("Conta Poupança aberta com sucesso! Saldo inicial: R$" + String.format("%.2f", this.saldo));
      }
   }

   public void fecharConta() {
      if (!this.status) {
         System.out.println("A conta já está fechada.");
         return;
      }
      if (this.saldo > 0) {
         System.out.println("Não é possível fechar a conta com saldo positivo. Saque o dinheiro primeiro. Saldo atual: R$" + String.format("%.2f", this.saldo));
         return;
      }
      if (this.saldo < 0) {
         System.out.println("Não é possível fechar a conta com saldo negativo. Regularize seu débito. Saldo atual: R$" + String.format("%.2f", this.saldo));
         return;
      }
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso!");
   }

   public void depositar(double valor) {
      if (!this.status) {
         System.out.println("Não é possível depositar em uma conta fechada.");
         return;
      }
      if (valor <= 0) {
         System.out.println("O valor do depósito deve ser positivo.");
         return;
      }
      this.saldo += valor;
      System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso. Novo saldo: R$" + String.format("%.2f", this.saldo));
   }

   public void sacar(double valor) {
      if (!this.status) {
         System.out.println("Não é possível sacar de uma conta fechada.");
         return;
      }
      if (valor <= 0) {
         System.out.println("O valor do saque deve ser positivo.");
         return;
      }
      if (this.saldo < valor) {
         System.out.println("Saldo insuficiente para realizar o saque. Saldo atual: R$" + String.format("%.2f", this.saldo));
         return;
      }
      this.saldo -= valor;
      System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso. Novo saldo: R$" + String.format("%.2f", this.saldo));
   }

   public void pagarMensal() {
      if (!this.status) {
         System.out.println("Não é possível pagar mensalidade de uma conta fechada.");
         return;
      }
      if (this.tipo == null) {
         System.out.println("Erro: Tipo de conta não definido. Não é possível calcular a mensalidade.");
         return;
      }

      double valorMensalidade = 0;
      if (this.tipo.equals("CC")) {
         valorMensalidade = 12.0; // Exemplo: Mensalidade da Conta Corrente
      } else if (this.tipo.equals("CP")) {
         valorMensalidade = 20.0; // Exemplo: Mensalidade da Conta Poupança
      }

      if (this.saldo < valorMensalidade) {
         System.out.println("Saldo insuficiente para pagar a mensalidade. Saldo atual: R$" + String.format("%.2f", this.saldo));
         return;
      }
      this.saldo -= valorMensalidade;
      System.out.println("Mensalidade de R$" + String.format("%.2f", valorMensalidade) + " paga com sucesso. Novo saldo: R$" + String.format("%.2f", this.saldo));
   }

   public void cadastro() {
      System.out.println("--- Dados da Conta ---");
      System.out.println("Número da conta: " + this.getNumeroConta());
      System.out.println("Tipo da conta: " + (this.getTipo() != null ? this.getTipo() : "Tipo inválido/não definido"));
      System.out.println("Saldo: R$" + String.format("%.2f", this.getSaldo())); // Formata para 2 casas decimais
      System.out.println("Status: " + (this.isStatus() ? "Aberta" : "Fechada"));
      System.out.println("----------------------");
   }
}