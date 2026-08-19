public class ProtocoloTecnico extends Protocolo {
  private String equipamento;
  private boolean semSinal;

  public ProtocoloTecnico(Cliente cliente, String assunto, String equipamento, boolean semSinal) {
    super(cliente, assunto); // construtor papai

    this.equipamento = equipamento;
    this.semSinal = semSinal;
  }

  public String getEquipamento() {
    return equipamento;
  }

  public boolean isSemSinal() {
    return semSinal;
  }

}
