import java.util.Scanner;
import java.lang.Math;

  public class Cono{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Area de cono helado \n" +
      "\t" + "Ingresa la base del triangulo rectangulo y radio");
      double R = input.nextDouble();
      System.out.println("Hipotenusa del triangulo rectangulo");
      double H = input.nextDouble();
      double C =Math.sqrt ((Math.pow(H, 2))-(Math.pow(R, 2)));
      double AT = (R * C)/2;
      double AC = (Math.PI * (Math.pow (R, 2))) /2;
      double Area = AT + AC;
      System.out.println("El area superior del afigura es igual a: " + AC + "\n" +
      "\t" + "El cateto faltante es: " + C + "\n" +
      "\t"+ "EL area de la parte inferios del cono es igual a: " + AT + "\n" +
      "\t" + "El area total es igual a: " + Area);
   }
}
