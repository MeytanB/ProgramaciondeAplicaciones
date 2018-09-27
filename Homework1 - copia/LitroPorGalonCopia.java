import java.util.Scanner;

  public class LitroPorGalon{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Cantidad de litros por galon" + "\n" +
      "\t" + "Ingresa la cantidad de litros que produce");
      double L = input.nextDouble();
      System.out.println("Ingresa el precio por galon");
      double PG = input.nextDouble();
      double TG = L / 3.785;
      double GA = PG * TG;
      System.out.println("Se produgeron: " + TG + " galones\n" +
      "\t" + "Se ganaron: " + GA);
    }
 }
