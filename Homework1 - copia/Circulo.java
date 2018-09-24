import java.util.Scanner;
import java.lang.Math;

  public class Circulo{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Circunferencia de un circulo" + "\n" +
      "\t" + "Ingresa el radio ");
      double R = input.nextDouble();
      double Area = Math.PI*(Math.pow (R, 2));
      System.out.println("El area es: " + Area );
    }
  }
