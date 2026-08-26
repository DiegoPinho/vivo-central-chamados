public class ChamadoFinanceiro extends Chamado implements Escalavel {
  private double valorContestado;

  public ChamadoFinanceiro(Cliente cliente, String assunto, double valorContestado) {
    super(cliente, assunto);
    this.valorContestado = valorContestado;
  }

  public double getValorContestado() {
    return valorContestado;
  }

  @Override
  public int getPrazo() {
    if (this.valorContestado > 500) {
      return 48;
    } else {
      return 120;
    }
  }

  @Override
  public boolean precisaEscalar() {
    return this.valorContestado > 1000;
  }

  @Override
  public String getAreaResponsavel() {
    return " Auditoria Financeira";
  }

}
