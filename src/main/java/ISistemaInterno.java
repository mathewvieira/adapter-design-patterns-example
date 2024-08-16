public interface ISistemaInterno {
  public String getEndereco(String cep);

  public void setEndereco(String endereco);

  public Boolean validarEndereco();

  public Boolean salvarEndereco();
}