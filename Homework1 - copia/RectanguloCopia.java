import java.util.Scanner;

  public class Rectangulo{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Quieres saber el area de un rectangulo" + "\n" +
      "\t" + "Ingresa la altura ");
      double A = input.nextDouble();
      System.out.println("Ingresa el ancho ");
      double B = input.nextDouble();
      double Area = A*B;
      System.out.println("El area es: " + Area );
    }
  }
