public class APIExterna implements IAPIExterna {

  private String endereco;

  public String getEndereco(String cep) {
    if (this.buscarEndereco(cep) && this.formatarEndereco()) {
      return this.endereco;
    }
    return null;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Boolean buscarEndereco(String cep) {
    this.endereco = cep + " - melancia"; // Substituir por chamada real
    return true;
  }

  public Boolean formatarEndereco() {
    this.endereco = endereco + " com abacaxi"; // Substituir por formatação real
    return true;
  }
}