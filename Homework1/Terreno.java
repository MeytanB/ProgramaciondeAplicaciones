import java.util.Scanner;

  public class Terreno{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("\n Area de un terreno irregular" + "\n" +
      "\t" + "Ingresa la altura del triangulo y rectangulo unidos ");
      double A = input.nextDouble();
      System.out.println("\n Ingresa la base del trangulo y del rectangulo ");
      double B = input.nextDouble();
      System.out.println( "\n Ingresa la altura del rectangulo ");
      double C = input.nextDouble();
      double AT = (C * (A-C))/2;
      double AR = B * C;
      double Area = AT + AR;
      System.out.println("Esta es el area del triangulo: " + AT + "\n" +
      "\t" + "Esta es el area del rectangulo: " + AR + "\n" +
      "\t" + "Este el el area general de la figura: " + Area);
   }
}
