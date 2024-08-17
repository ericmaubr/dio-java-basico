import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMeScanner {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try {

      System.out.println("Digite seu nome");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenone");
      String sobrenome = scanner.next();

      System.out.println("Digite a sua altura");
      double altura = scanner.nextDouble();

      System.out.println("Digite a sua idade");
      int idade = scanner.nextInt();

      System.out.println("Olá, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "cm ");

    }
    catch (InputMismatchException e) {
      System.out.println("Os campos idade e altura precisam ser numéricos no formato americano");
    }
    finally {
      scanner.close();
    }

  }

}
