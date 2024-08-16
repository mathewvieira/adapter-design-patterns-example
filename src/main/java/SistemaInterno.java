public class SistemaInterno extends Adapter implements ISistemaInterno {
  private String endereco;

  private Adapter adapter;

  public SistemaInterno() {
    this.adapter = new Adapter();
  }

  public String getEndereco(String cep) {
    this.endereco = adapter.getEndereco(cep);
    if (this.validarEndereco() && this.salvarEndereco()) {
      return this.endereco;
    }
    return null;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Boolean validarEndereco() {
    return true;
  }

  public Boolean salvarEndereco() {
    return true;
  }
}