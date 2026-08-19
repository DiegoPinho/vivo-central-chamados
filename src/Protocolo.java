public class Protocolo {

  private static int contadorProtocolos = 0;

  private String codigo;
  private String status;
  private String assunto;
  private Cliente cliente;

  public Protocolo(Cliente cliente, String assunto) {
    contadorProtocolos++;

    this.cliente = cliente;
    this.assunto = assunto;

    this.codigo = "VIVO-" + contadorProtocolos;
    this.status = "ABERTO";
  }

  public static int getContadorProtocolos() {
    return contadorProtocolos;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getStatus() {
    return status;
  }

  public String getAssunto() {
    return assunto;
  }

  public Cliente getCliente() {
    return cliente;
  }

}
