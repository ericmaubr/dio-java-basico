enum Operacao {
  SOMA {
      @Override
      public double executar(double a, double b) {
          return a + b;
      }
  },
  SUBTRACAO {
      @Override
      public double executar(double a, double b) {
          return a - b;
      }
  },
  MULTIPLICACAO {
      @Override
      public double executar(double a, double b) {
          return a * b;
      }
  },
  DIVISAO {
      @Override
      public double executar(double a, double b) {
          return a / b;
      }
  };

  public abstract double executar(double a, double b);
}

public class TesteEnumOperacao {
  public static void main(String[] args) {
      double x = 5;
      double y = 2;

      Operacao operacao = Operacao.SOMA;
      System.out.println("Resultado: " + operacao.executar(x, y));

      operacao = Operacao.MULTIPLICACAO;
      System.out.println("Resultado: " + operacao.executar(x, y));
  }
}
