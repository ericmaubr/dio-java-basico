import java.util.Scanner;
import java.util.Locale;

public class UsuarioiPhone {

  public static void main(String[] args) {

    boolean exitWhile = false;
    iPhone celulariPhone = new iPhone();


    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    String userInput;


    while (!exitWhile) {
    
        printMenu();
    
        userInput = sc.next();
        
        if (userInput != null ) {

          switch (userInput.toUpperCase()){
              case "1": {
                celulariPhone.tocar();
                break;
              }
            case "2": {
                celulariPhone.pausar();
                break;
            }
            case "3": {
                System.out.println("Qual música você quer ouvir?");
                userInput = sc.nextLine();
                userInput = sc.nextLine();
                celulariPhone.selecionarMusica(userInput);
                break;
            }
            
            case "4": {
                System.out.println("Para qual número você quer ligar?");
                userInput = sc.nextLine();
                userInput = sc.nextLine();
                celulariPhone.ligar(userInput);
                break;
            }

            case "5": {
                celulariPhone.atender();
                break;
            }
            
            case "6": {
                celulariPhone.iniciarCorreioVoz();
                break;
            }

            case "7": {
                System.out.println("Digite a URL");
                userInput = sc.nextLine();
                userInput = sc.nextLine();
                celulariPhone.exibirPagina(userInput);
                break;
            }

            case "8": {
                celulariPhone.adicionarNovaAba();
                break;
            }
            
            case "9": {
                celulariPhone.atualizarPagina();
                break;
            }

            case "X": {
                System.out.println("Saindo do programa.");
                exitWhile = true;
                break;
            }

            default: {
                System.out.println("Opção digitada é inválida.");
            }
          }

        }
        else {
          System.out.println("Escolha uma opção válida.");
        }

    }

  }

  private static void printMenu() {
    System.out.println("*************************************");
    System.out.println("Escolha a ação do iPhone");
    System.out.println("1 - Tocar música");
    System.out.println("2 - Pausar música");
    System.out.println("3 - Selecionar música");
    System.out.println("4 - Fazer ligação telefônica");
    System.out.println("5 - Atender ligação telefônica");
    System.out.println("6 - Iniciar correio de voz");
    System.out.println("7 - Exibir página Web");
    System.out.println("8 - Adicionar nova aba no navegador");
    System.out.println("9 - Atualizar página do navegador");
    System.out.println("X - Sair do programa");
    System.out.println("*************************************");
    
  }

}
