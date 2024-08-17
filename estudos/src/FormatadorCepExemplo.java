public class FormatadorCepExemplo {

  public static void main(String[] args){

    try {
      String cepFormatado = formatarCep("12345678");
      System.out.println("CEP: " + cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("CEP com menos de 8 caracteres");
    }

  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if(cep.length() != 8)
      throw new CepInvalidoException();

    return "23.765-064";
  }

}
