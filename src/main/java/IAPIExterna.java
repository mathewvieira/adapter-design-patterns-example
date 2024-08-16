public interface IAPIExterna {
  public String getEndereco(String cep);

  public void setEndereco(String endereco);

  public Boolean buscarEndereco(String cep);

  public Boolean formatarEndereco();
}