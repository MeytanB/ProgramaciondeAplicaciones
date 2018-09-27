import java.util.Scanner;

  public class Precio{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de lapices a comprar");
    int Num = input.nextInt();
    double Pag;
    if (Num > 0 && Num < 1000){
      Pag = Num * 0.90;
      System.out.println("Usted pagara 90 centavos por lapiz");
    }
    else{
      Pag = Num * 0.85;
      System.out.println("Usted pagara 85 centavos por lapiz");
    }
    System.out.println("Usted pagara: " + Pag + " en total por comprar " + Num + " Lapices");
    }
  }
