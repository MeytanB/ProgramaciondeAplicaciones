import java.util.Scanner;

  public class MayorQue{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    int A = input.nextInt();
    System.out.println("Ingrese el segundo numero");
    int B = input.nextInt();
    int M;
    if (A > B){
      M = A;
    }
    else{
      M = B;
    }
    System.out.println("El numero mayor es el: " + M);
    }
  }
