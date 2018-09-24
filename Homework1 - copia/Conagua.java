import java.util.Scanner;

  public class Conagua{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Pago que realizaras por metros cubicos consumidos por alberca" + "\n" +
      "\t" + "Ingresa la altura de la alberca");
      double A = input.nextDouble();
      System.out.println("Ingresa el largo de la alberca");
      double L = input.nextDouble();
      System.out.println("Ingresa el ancho de la alberca");
      double N = input.nextDouble();
      System.out.println("Ingresa el precio por metro cubico");
      double CM = input.nextDouble();
      double V = A*L*N;
      double PAG = V*CM;
      System.out.println("El volumen total de la alberca es: " + V + " metros cubicos\n" +
      "\t" + "El pago que realizara sera de: " + PAG);
    }
 }
