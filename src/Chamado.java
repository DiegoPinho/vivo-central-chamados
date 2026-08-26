public class Chamado {
  private static int contadorProtocolos = 0;

  private String protocolo;
  private Cliente cliente;
  private String assunto;
  private String status;

  public Chamado(Cliente cliente, String assunto) {
    contadorProtocolos++;

    this.protocolo = String.format("VIVO-%04d", contadorProtocolos);
    this.cliente = cliente;
    this.assunto = assunto;
    this.status = "ABERTO";
  }

  public String getProtocolo() {
    return protocolo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public String getAssunto() {
    return assunto;
  }

  public String getStatus() {
    return status;
  }

  public static int getTotalDeChamados() {
    return contadorProtocolos;
  }

  public int getPrazo() {
    return 24;
  }

}
