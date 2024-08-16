public interface IAdapter {
  public String getEndereco(String cep);

  public void setEndereco(String endereco);

  public Boolean converterCEP();

  public Boolean converterEndereco();
}