import java.util.Scanner;

  public class Telefonica{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final String DIH = "Domindo";
    final String TUD = "Vespertino";
    System.out.println("Cuantos minutos hablastes");
    int TI = input.nextInt();
    double PAG;
    double IMP;
    if (TI < 5){
      PAG = 1;
    }
    else if (TI < 9){
      PAG = 0.80;
    }
    else if (TI < 11){
      PAG = 0.70;
    }
    else{
      PAG = 0.50;
    }
    System.out.println("Que dia es");
    String DI = input.next();
    if (DI == DIH){
      IMP = 0.03;
    }
    else{
      System.out.println("Que turno es");
      String TU = input.next();
      if (TU == TUD){
        IMP = 0.15;
      }
      else{
        IMP = 0.10;
      }
    }
    double TOT = PAG * IMP;
    System.out.println("El pago por tu llamada es de:" + TOT);
    }
  }
