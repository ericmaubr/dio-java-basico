public class SmartTV {

  boolean ligada = false;
  int canal = 0;
  int volume = 0;

  public SmartTV(boolean ligada, int canal, int volume) {
    this.ligada = ligada;
    this.canal = canal;
    this.volume = volume;
  }

  public SmartTV() {
    ligada = false;
    canal = 1;
    volume = 25;
  
  }

  public void ligar() {
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }

  public void aumentarVolume() {
    this.volume++;
  }

  public void diminuirVolume() {
    if (this.volume > 0) {
      this.volume--;
    }
  }

  public void mudarCanal(int novoCanal) {
    this.canal = novoCanal;
  }

  public void aumentarCanal() {
    this.canal++;
  }

  public void diminuirCanal() {
    if (this.canal > 0) {
      this.canal--;
    }
  }


}
