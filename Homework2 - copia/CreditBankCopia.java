import java.util.Scanner;

  public class CreditBank{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Ingresa tu tipo de targeta que desea aumnetar su credit");
      double TT = input.nextDouble();
      System.out.println("Ingresa el limite actual de tu targeta");
      double LA = input.nextDouble();
      double AC;
      if (TT == 1)
      AC = 1.25;
      else if (TT == 2)
      AC = 1.35;
      else if (TT == 3)
      AC = 1.40;
      else
      AC = 1.50;
      double NC = LA * AC;
      System.out.println("Su nuevo limite de credito es: " + NC);
    }
  }
