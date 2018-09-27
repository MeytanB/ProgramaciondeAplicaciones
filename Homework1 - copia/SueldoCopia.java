import java.util.Scanner;

  public class Sueldo{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Sueldo ganado por semana" + "\n" +
      "\t" + "Ingresa las horas que trabajo durante la semana");
      double HT = input.nextDouble();
      System.out.println("Ingresa el pago por hora");
      double PH = input.nextDouble();
      double SS = HT*PH;
      System.out.println("Usted gano : " + SS + " esta semana");
    }
 }
