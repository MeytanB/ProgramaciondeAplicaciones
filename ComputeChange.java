import java.util.Scanner;
//utilerias que se utilizan
  public class ComputeChange{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //Lee lo ingresdo DE LA CONSOLA
      System.out.println("Enter an amount in doble");
      //Sera lo primero que se mostrara al usuario
      double amount = input.nextDouble();
      //agrerar bariable para el usuario
      int cents = (int)(amount * 100);
      //realiza la comvercion
      //casting=(int) comvertir los balores
      int numberOfDollars =cents / 100;
      //ota comversion
      cents = cents % 100;
      //residuo
      int numberOfQuarters = cents / 25;
      //los cuartos de dolar
      cents = cents % 25;
      //sobrantes del sobrante
      int numberOfDimes = cents / 10;
      //ahora entre 10
      cents = cents % 10;
      int numberOfNickels = cents / 5;
      //ahora los de 5
      cents = cents % 5;
      //resto
      int numberOfPennies =cents;
      //los centabos que sobraron en total
      System.out.println("Your amount " + amount + "Consist of \n" +
      "\t" + numberOfDollars + "Dollars" +
      "\t" + numberOfQuarters + "quarters" +
      "\t" + numberOfDimes + "dimes" +
      "\t" + numberOfNickels + "nickels" +
      "\t" + numberOfPennies + "pennies");
      }
}
