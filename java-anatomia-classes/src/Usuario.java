public class Usuario {

  public static void main(String[] args) {

    SmartTV smartTv = new SmartTV();

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Volume atual: " + smartTv.volume);
    System.out.println("Canal atual:" + smartTv.canal);

    smartTv.ligar();
    System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    smartTv.desligar();
    System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Novo volume atual: " + smartTv.volume);

    smartTv.aumentarVolume();
    System.out.println("Novo volume atual: " + smartTv.volume);

    smartTv.mudarCanal(13);
    System.out.println("Novo canal: " + smartTv.canal);

    smartTv.aumentarCanal();
    System.out.println("Novo canal: " + smartTv.canal);

    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
    System.out.println("Novo canal: " + smartTv.canal);





  }

}
