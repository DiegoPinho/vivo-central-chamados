public class ProtocoloFinanceiro extends Protocolo {
  private double valor;

  public ProtocoloFinanceiro(Cliente cliente, String assunto, double valor) {
    super(cliente, assunto);

    this.valor = valor;
  }
}
