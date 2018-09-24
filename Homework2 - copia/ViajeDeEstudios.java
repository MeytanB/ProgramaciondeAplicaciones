import java.util.Scanner;

  public class ViajeDeEstudios{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Cuantos alumnos asistiran");
    int NA = input.nextInt();
    int PA;
    int TOT;
    if(NA > 99){
      PA = 65;
      System.out.println("Se pagaran 65 por alumno");
      TOT = NA * PA;
      System.out.println("El pago total sera de: " + TOT);
    }
    else if (NA > 49){
      PA = 70;
      System.out.println("Se pagaran 70 por alumno");
      TOT = NA * PA;
      System.out.println("El pago total sera de: " + TOT);
    }
    else if (NA > 29){
      PA = 95;
      System.out.println("Se pagaran 95 por alumno");
      TOT = NA * PA;
      System.out.println("El pago total sera de: " + TOT);
    }
    else{
      System.out.println("Se tendra que pagar el total de 4000 por el autobus");
    }
    }
  }
