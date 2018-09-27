import java.util.Scanner;

  public class LaLangostaAhumada{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero total de personas que acistiran al banquete");
    int NP = input.nextInt();
    int TOT;
    if (NP > 0 && NP < 200){
      TOT = NP * 95;
      System.out.println("El costo por persona sera de 95");
    }
    else if (NP > 199 && NP < 300){
      TOT = NP * 85;
      System.out.println("El costo por persona sera de 85");
    }
    else{
      TOT = NP * 75;
      System.out.println("El costo por persona sera de 75");
    }
    System.out.println("El pago total por el banquete sara de: " + TOT);
    }
  }
