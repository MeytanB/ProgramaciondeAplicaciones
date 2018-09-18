import java.util.Scanner;

  public class NumMayor{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Ingrese un numero");
      int Uno = input.nextInt();
      System.out.println("Ingrese un numero");
      int Dos = input.nextInt();
      System.out.println("Ingrese un numero");
      int Tres = input.nextInt();
      if ((Uno > Dos) && (Uno > Tres) && (Dos > Tres))
      System.out.println("El numero mayo es: " + Uno + " El intermedio es: " + Dos + " y el numero menor es: " + Tres);
      else if ((Uno > Dos) && (Uno > Tres) && (Tres > Dos))
      System.out.println("El numero mayo es: " + Uno + " El intermedio es: " + Tres + " y el numero menor es: " + Dos);
      else if ((Dos > Uno) && (Dos > Tres) && (Uno > Tres))
      System.out.println("El numero mayo es: " + Dos + " El intermedio es: " + Uno + " y el numero menor es: " + Tres);
      else if ((Dos > Uno) && (Dos > Tres) && (Tres > Uno))
      System.out.println("El numero mayo es: " + Dos + " El intermedio es: " + Tres + " y el numero menor es: " + Uno);
      else if ((Tres > Uno) && (Tres > Dos) && (Dos > Uno))
      System.out.println("El numero mayo es: " + Tres + " El intermedio es: " + Dos + " y el numero menor es: " + Uno);
      else
      System.out.println("El numero mayo es: " + Tres + " El intermedio es: " + Uno + " y el numero menor es: " + Dos);
    }
  }
