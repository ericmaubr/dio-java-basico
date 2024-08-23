public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

  /*
   * Implementa método tocar de Reprodutor Musical
   */
  @Override
  public void tocar(){
    System.out.println("Reprodutor musical: tocar música");
  }

  /*
   * Implementa método pausar de Reprodutor Musical
   */
  @Override
   public void pausar() {
    System.out.println("Reprodutor musical: pausar música");
  }

  /*
   * Implementa método selecionarMusica de ReprodutorMusical
   */
  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Reprodutor musical: selecionar música " + musica);
  }

  /*
   * Implementa método ligar de AparelhoTelefonico
   */
  @Override
  public void ligar(String numero) {
    System.out.println("Telefone: ligar " + numero);
  }

  /*
   * Implementa método antender de AparelhoTelefonico
   */
  @Override
  public void atender() {
    System.out.println("Telefone: atender");
  }  

  /*
   * Implementa método iniciarCorreioVoz de AparelhoTelefonico
   */
  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Telefone: iniciar correio de voz");
  }

  /*
   * Implementa o método exibirPagina de NavegadorInternet
   */
  @Override
  public void exibirPagina(String url) {
    System.out.println("Navegador: exibir página " + url);
  }
  
  /*
   * Implementa o método adicionarNovaAba de NavegadorInternet
   */
  @Override
  public void adicionarNovaAba() {
    System.out.println("Navegador: adicionar aba");
  }
  
  /*
   * Implementa o método atualizarPagina de NavegadorInternet
   */
  @Override
  public void atualizarPagina() {
    System.out.println("Navegador: atualizar página");
  }
  
  
}
