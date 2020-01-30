//Programa Java que me permita ingresar un número por teclado entre el 1 al 30 y muestre por pantalla su representacion en romanos
import java.util.Scanner;

public class NumerosRomanos {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N;
      N=NumerosRomanos;
      do {
             System.out.println("Introduce un número entre 1 al 30: ");
             N = sc.nextInt();
      } while (N < 1 || N > 30);
      System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));
  }
 }