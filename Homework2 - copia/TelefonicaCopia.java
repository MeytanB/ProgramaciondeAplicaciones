import java.util.Scanner;

  public class Telefonica{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final String DIH = "Domingo";
    final String TUD = "Vespertino";
    System.out.println("Cuantos minutos hablastes");
    int TI = input.nextInt();
    double PAG;
    double IMP;
    if (TI < 6){
      PAG = 1;
      System.out.println("Usted pagara 1 por minuto");
    }
    else if (TI < 9){
      PAG = 0.80;
      System.out.println("Usted pagara 0.80 por minuto");
    }
    else if (TI < 11){
      PAG = 0.70;
      System.out.println("Usted pagara 0.70 por minuto");
    }
    else{
      PAG = 0.50;
      System.out.println("Usted pagara 0.50 por minuto");
    }
    System.out.println("Que dia es");
    String DI = input.next();
    if (DIH.equals(DI)){
      IMP = 0.97;
    }
    else{
      System.out.println("Que turno es");
      String TU = input.next();
      if (TUD.equals(TU)){
        IMP = 0.85;
      }
      else{
        IMP = 0.90;
      }
    }
    double TOT = (PAG * TI) * IMP;
    System.out.println("El pago por tu llamada es de:" + TOT);
    }
  }
