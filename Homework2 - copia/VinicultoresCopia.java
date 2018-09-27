import java.util.Scanner;

  public class Vinicultores{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final String Tipo = "A";
    final String Tipoo = "B";
    System.out.println("Ingrese A o B dependiendo del tipo de uva");
    String TI = input.next();
    System.out.println("Ingrese el tamaño de la uva");
    int TA = input.nextInt();
    System.out.println("Ingrese el total en kilos de uva");
    int K = input.nextInt();
    System.out.println("Ingrese el precio por kilo de uva");
    double P = input.nextDouble();
    double GA;
    if (Tipo.equals(TI) && TA == 1){
      GA = (P * K) + (K * 0.20);
      System.out.println("El precio inicial agregado por kilo sera de 20 centavos");
    }
    else if (Tipo.equals(TI) && TA == 2){
      GA = (P * K) + (K * 0.30);
      System.out.println("El precio inicial agregado por kilo sera de 30 centavos");
    }
    else if (Tipoo.equals(TI) && TA == 1){
      GA = (P * K) + (K * -0.30);
      System.out.println("El precio inicial rebajado por kilo sera de 30 centavos");
    }
    else {
      GA = (P * K) + (K * -0.50);
      System.out.println("El precio inicial rebajado por kilo sera de 50 centavos");
    }
    System.out.println("La ganacia total sera de: " + GA);
    }
  }
