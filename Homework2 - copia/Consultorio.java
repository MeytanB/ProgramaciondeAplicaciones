import java.util.Scanner;

  public class Consultorio{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Cuantas citas de seguimineto de tratamineto se necesitan");
    int NC = input.nextInt();
    int CC;
    if (NC < 4){
      CC = 200;
      System.out.println("El costo por cita sera de 200");
    }
    else if (NC < 6){
      CC = 150;
      System.out.println("El costo por cita sera de 150");
    }
    else if (NC < 10){
      CC = 100;
      System.out.println("El costo por cita sera de 100");
    }
    else{
      CC = 50;
      System.out.println("El costo por cita sera de 50");
    }
    int TOT = CC * NC;
    System.out.println("El costo del tratamineto sera de: " + TOT);
    }
  }
