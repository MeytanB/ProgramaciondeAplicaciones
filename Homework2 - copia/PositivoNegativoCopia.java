import java.util.Scanner;

  public class PositivoNegativo{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa un numero");
    int Num = input.nextInt();
    if (Num > 0){
      System.out.println("El numero " + Num + " es POSITIVO");
    }
    else if (Num < 0){
      System.out.println("El numero " + Num + " es NEGATIVO");
    }
    else{
      System.out.println("Tu numero es cero asi que mucha y mucha");
    }
    }
  }
