public class ChamadoTecnico extends Chamado implements Escalavel {
  private String equipamento;
  private boolean semSinal;

  public ChamadoTecnico(Cliente cliente, String assunto, String equipamento, boolean semSinal) {
    super(cliente, assunto);
    this.equipamento = equipamento;
    this.semSinal = semSinal;
  }

  public String getEquipamento() {
    return this.equipamento;
  }

  public boolean isSemSinal() {
    return this.semSinal;
  }

  @Override
  public int getPrazo() {
    if (this.isSemSinal()) {
      return 24;
    } else {
      return 48;
    }
  }

  @Override
  public boolean precisaEscalar() {
    return this.semSinal;
  }

  @Override
  public String getAreaResponsavel() {
    return "Field Service";
  }

}
