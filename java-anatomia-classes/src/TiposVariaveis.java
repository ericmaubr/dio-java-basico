public class TiposVariaveis {

  public static void main(String[] args) {
  
    //tipos primitivos
    byte b = 1;   // -128 a 127
    short s = 2;  // -32768 a 32767
    int i = 3;    // -2.147.483.648 - preferível
    long l = 4L;  // -9.223.372.036.854.775.808 - precisa terminar com o número com L, caso contrário será int 
    float f = 5.0f; // -3,4028 E +38 - precisa terminar com o número com F, caso contrário será double
    double d = 6.0; // -1,79769 E + 308 - preferível
    char c = '7';
    boolean bo = true;

    //string
    String st = "8";
    
    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(c);
    System.out.println(bo);
    System.out.println(st);

    final double PI = 3.1415;

    System.out.println(PI);

  }
  
  

}
