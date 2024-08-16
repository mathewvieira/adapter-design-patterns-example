public class Adapter extends APIExterna {

  private String cep;
  private String endereco;

  private APIExterna apiExterna;

  public Adapter() {
    this.apiExterna = new APIExterna();
  }

  public String getEndereco(String cep) {
    this.cep = cep;
    if (this.converterCEP()) {
      this.endereco = apiExterna.getEndereco(this.cep);
      if (this.converterEndereco()) {
        return endereco;
      }
    }
    return null;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Boolean converterCEP() {
    this.cep = cep.replace("-", "");
    return true;
  }

  public Boolean converterEndereco() {
    this.endereco = endereco + "!"; // Substituir por conversão real
    return true;
  }
}