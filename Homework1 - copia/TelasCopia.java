import java.util.Scanner;

  public class Telas{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Conversion de metros a pulgadas por rollo de tela" + "\n" +
      "\t" + "Ingresa la cantidad de metros que requiera");
      double CM = input.nextDouble();
      double PG = CM / 0.0254;
      System.out.println("Se necesitaran: " + PG + " pulgadas");
    }
 }
