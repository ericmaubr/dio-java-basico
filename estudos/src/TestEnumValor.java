enum Moeda {
  UM_CENTAVO(0.01, "Um centavo"),
  CINCO_CENTAVOS(0.05, "Cinco centavos"),
  DEZ_CENTAVOS(0.10, "Dez centavos"),
  VINTE_E_CINCO_CENTAVOS(0.25, "Vinte e cinco centavos"),
  CINQUENTA_CENTAVOS(0.50, "Cinquenta centavos"),
  UM_REAL(1.00, "Um real");

  private final double valor;
  private final String descricao;

  // Construtor do enum
  Moeda(double valor, String descricao) {
      this.valor = valor;
      this.descricao = descricao;
  }

  // Método para obter o valor da moeda
  public double getValor() {
      return valor;
  }

  // Método para obter a descrição da moeda
  public String getDescricao() {
      return descricao;
  }
}

public class TestEnumValor {
  public static void main(String[] args) {
      Moeda moeda = Moeda.UM_REAL;
      System.out.println("Valor da moeda: " + moeda.getValor());
      System.out.println("Descrição da moeda: " + moeda.getDescricao());
  }
}
