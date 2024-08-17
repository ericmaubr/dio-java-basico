import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Contador {

  public static void main(String[] args) {

    int[] numeros;

    try {

      numeros = lerEntrada(args);
      conta(numeros[0], numeros[1]);

    }
    catch(NumberFormatException | InputMismatchException e) {
      System.out.println("Os parâmetros de entrada precisam ser inteiros");
    }
    catch (ParametrosInvalidosException e) { 
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
  }

  static void conta(int pPrimeiroNum, int pSegundoNum) throws ParametrosInvalidosException {

    int contagem = pSegundoNum - pPrimeiroNum;

    if (contagem < 0) {
      throw new ParametrosInvalidosException();
    }

    for (int i=0; i <contagem; i++) {
      System.out.println("Imprimindo o número " + (i+1));
    }
  }

  static int[] lerEntrada(String[] args) throws NumberFormatException, InputMismatchException {

    int[] numeros = new int[2];

    if (args.length == 2) {
      numeros[0] = Integer.parseInt(args[0]);
      numeros[1] = Integer.parseInt(args[1]);
    }
    else {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);

      try {
        System.out.println("Digite o primeiro parâmetro");
        numeros[0] = sc.nextInt();
  
        System.out.println("Digite o segundo parâmetro");
        numeros[1] = sc.nextInt();
      }

      finally {
        sc.close();  
      }
    } 
    return numeros; 
  }
}
