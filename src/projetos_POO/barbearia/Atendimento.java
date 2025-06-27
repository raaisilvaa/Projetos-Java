package projetos_POO.barbearia;

public class Atendimento {
   private String nomeCliente;
   private String servico;
   private double precoServico;
   private double valorPagoCliente;
   private boolean atendimentoConcluido;

   public Atendimento(String nomeCliente, String servico) {
      this.nomeCliente = nomeCliente;
      this.servico = servico;
      this.valorPagoCliente = 0.0;
      this.atendimentoConcluido = false;
      this.definirPrecoServico();
      System.out.println("Novo atendimento iniciado: Cliente: " + nomeCliente + ", Serviço: " + servico + ", Preço: " + precoServico);
   }

   public String getNomeCliente() {
      return nomeCliente;
   }

   public void setNomeCliente(String nomeCliente) {
      this.nomeCliente = nomeCliente;
   }

   public String getServico() {
      return servico;
   }

   public void setServico(String servico) {
      this.servico = servico;
      this.definirPrecoServico();
   }

   public double getPrecoServico() {
      return precoServico;
   }

   public void setPrecoServico(double precoServico) {
      this.precoServico = precoServico;
   }

   public double getValorPagoCliente() {
      return valorPagoCliente;
   }

   public void setValorPagoCliente(double valorPagoCliente) {
      this.valorPagoCliente = valorPagoCliente;
   }

   public boolean isAtendimentoConcluido() {
      return atendimentoConcluido;
   }

   public void setAtendimentoConcluido(boolean atendimentoConcluido) {
      this.atendimentoConcluido = atendimentoConcluido;
   }

   private void definirPrecoServico() {
      if (this.servico.equalsIgnoreCase("Corte")) {
         this.precoServico = 40.00;
      } else if (this.servico.equalsIgnoreCase("Barba")) {
         this.precoServico = 35.00;
      } else if (this.servico.equalsIgnoreCase("Corte e Barba")) {
         this.precoServico = 70.00;
      } else {
         this.precoServico = 0.0;
         System.out.println("Descrição do serviço inválida.");
      }
   }

   public void registrarPagamento(double valorEntregue) {
      System.out.println("Pagamento sendo registrado...");
      this.valorPagoCliente = valorEntregue;

      if (this.valorPagoCliente < this.precoServico) {
         this.atendimentoConcluido = false;
         System.out.println("Valor insuficiente, necessário pagar mais.");
      } else {
         this.atendimentoConcluido = true;
         System.out.println("Pagamento foi recebido e concluído.");
      }
   }

   public void calcularTroco() {
      if (this.atendimentoConcluido) {
         double troco = this.valorPagoCliente - this.precoServico;
         System.out.println("Cálculo do Troco: Valor Pago: R$" + String.format("%.2f", this.valorPagoCliente) + " - Preço do Serviço: R$" + String.format("%.2f", this.precoServico) +
         " = Troco: R$" + String.format("%.2f", troco));
      } else {
         System.out.println("Erro: Não é possível calcular o troco. O pagamento não foi suficiente.");
      }
   }

   @Override
   public String toString() {
      if (this.atendimentoConcluido) {
         double troco = this.valorPagoCliente - this.precoServico;
         return "----- Recibo do Atendimento -----\n"
            + "Cliente: " + this.nomeCliente + "\n"
            + "Serviço: " + this.servico + " - Preço: R$" + String.format("%.2f", this.precoServico) + "\n"
            + "Valor Pago: R$" + String.format("%.2f", this.valorPagoCliente) + "\n"
            + "Troco: R$" + String.format("%.2f", troco) + "\n"
            + "--------------------------------";
      } else {
         return "Recibo não pode ser gerado porque o pagamento não foi concluído.";
      }
   }
}
