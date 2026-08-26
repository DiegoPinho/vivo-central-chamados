public class ChamadoComercial extends Chamado {
  private String produtoDesejado;

  public ChamadoComercial(Cliente cliente, String assunto, String produtoDesejado) {
    super(cliente, assunto);
    this.produtoDesejado = produtoDesejado;
  }

  public String getProdutoDesejado() {
    return produtoDesejado;
  }

  @Override
  public int getPrazo() {
    return 96;
  }

}
