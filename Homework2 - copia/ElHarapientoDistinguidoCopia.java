import java.util.Scanner;

  public class ElHarapientoDistinguido{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el precio del traje");
    int CT = input.nextInt();
    double DE;
    double PF;
    if (CT > 2500){
      DE = 0.85;
      System.out.println("Usted tendra un descuento del 15%");
    }
    else{
      DE = 0.92;
      System.out.println("Usted tendra un descuento del 8%");
    }
    PF = CT * DE;
    System.out.println("EL precio final por el traje sera de: " + PF);
    }
  }
