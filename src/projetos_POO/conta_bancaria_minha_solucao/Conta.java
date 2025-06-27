package projetos_POO.conta_bancaria_minha_solucao;

public class Conta {
   public long numConta;
   protected String tipo;
   private String dono;
   private double saldo;
   private boolean status;

   // Construtor
   public Conta(long numConta, String tipo, String dono, double saldo) {
      this.setNumConta(numConta);;
      this.setDono(dono);
      this.setTipo(tipo);
      this.setSaldo(0.0);
      this.setStatus(false);
   }

   // Getters e Setters
   public long getNumConta() {
      return numConta;
   }

   public void setNumConta(long numConta) {
      this.numConta = numConta;
   }

   public String getTipo() {
      return tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getDono() {
      return dono;
   }

   public void setDono(String dono) {
      this.dono = dono;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public boolean isStatus() {
      return status;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }

   public void abrirConta() {
      if (this.isStatus()) { // Verifica se já está ativa
         System.out.println("Conta " + this.getNumConta() + " já está aberta!");
         return;
      }
        
      this.setStatus(true);
      if (this.getTipo().equalsIgnoreCase("CC")) {
         this.setSaldo(50.00);
      } else if (this.getTipo().equalsIgnoreCase("CP")) {
         this.setSaldo(150.00);
      } else {
         this.setStatus(false);
         System.out.println("Tipo de conta inválido. Use 'CC' para Conta Corrente ou 'CP' para Conta Poupança.");
      }
   }

   public void fecharConta(double saldo) {
      if (this.getSaldo() > 0) {
         System.out.println("Conta com saldo. Saque o valor de R$" + this.saldo + " antes de fechar a conta.");
      } else if (this.getSaldo() < 0) {
         System.out.println("Conta em débito. Regularize sua situação antes de fechar a conta.");
      } else {
         this.setStatus(false);
         System.out.println("Conta fechada com sucesso!");
      }
   }

   public void depositar(double valor) {
      if (this.isStatus()) {
         if (valor > 0) {
            double novoSaldo = this.getSaldo() + valor;
            this.setSaldo(novoSaldo);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
         } else {
            System.out.println("Valor de depósito inválido!");
         }
      } else {
         System.out.println("Impossível depositar em uma conta fechada.");
      }
   }

   public void sacar(double valor) {
      if (this.isStatus()) {
         if (this.getSaldo() > 0) {
            if (this.getSaldo() >= valor) {
               double novoSaldo = this.getSaldo() - valor;
               this.setSaldo(novoSaldo);
               System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            } else {
               System.out.println("Saldo insuficiente para realizar o saque de R$" + valor + ". Saldo atual: R$" + this.getSaldo());
            }
         } else {
            System.out.println("Valor de saque inválido! O valor deve ser positivo.");
         }
      } else {
         System.out.println("Impossível sacar de uma conta fechada.");
      }
   }

   public void pagarMensal() {
      if (!this.isStatus()) {
         System.out.println("Conta fechada. Impossível cobrar mensalidade.");
         return; // Sai do método se a conta estiver fechada
      }

      double valorMensalidade;
      if (this.getTipo().equalsIgnoreCase("CC")) {
         valorMensalidade = 12.00;
      } else if (this.getTipo().equalsIgnoreCase("CP")) {
         valorMensalidade = 20.00;
      } else {
         this.setStatus(false);
         System.out.println("Erro: Tipo de conta inválido para cobrança de mensalidade.");
         return;
      } // Sai do método após lidar com o tipo inválido

      if (this.getSaldo() >= valorMensalidade) {
         double novoSaldo = this.getSaldo() - valorMensalidade;
         this.setSaldo(novoSaldo);
         // this.setSaldo(this.getSaldo() - valorMensalidade);
         System.out.println("Mensalidade de R$" + String.format("%.2f", valorMensalidade) + " debitada da conta " + this.getNumConta() + ". Novo saldo: R$" + String.format("%.2f", this.getSaldo()));
      } else {
         this.setStatus(false);
         System.out.println("Saldo insuficiente (R$" + this.getSaldo() + ") para pagar a mensalidade de R$" + valorMensalidade);
      }
      

   }

   @Override
   public String toString() {
      return "Conta: " + this.numConta + 
             "\nTipo: " + ("CC".equals(this.tipo) ? "Conta Corrente" : "Conta Poupança") +
             "\nDono: " + this.getDono() +
             "\nSaldo: R$" + String.format("%.2f", this.saldo) +
             "\nStatus: " + (this.status ? "Ativa" : "Inativa");
   }
}
