import java.util.Scanner;
import java.lang.Math;

  public class ProblemasSecuenciales{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double opcion = 0;
      while (opcion <= 8){
      if (opcion == 0){
      System.out.println("Tarea de progamacion: Problemas secuenciales\n" +
      "\t" + "Ingresa 1 para el programa 1.1 \n" +
      "\t" + "Ingresa 2 para el programa 1.2 \n" +
      "\t" + "Ingresa 3 para el programa 1.3 \n" +
      "\t" + "Ingresa 4 para el programa 1.4 \n" +
      "\t" + "Ingresa 5 para el programa 1.5 \n" +
      "\t" + "Ingresa 6 para el programa 1.6 \n" +
      "\t" + "Ingresa 7 para el programa 1.7 \n" +
      "\t" + "Ingresa 8 para el programa 1.8 \n" +
      "\t" + "Pero si lo abriste por error preciona 9 \n");
      opcion = input.nextDouble();
      }
      else if (opcion == 1){
        System.out.println("Quieres saber el area de un rectangulo" + "\n" +
        "\t" + "Ingresa la altura ");
        double A = input.nextDouble();
        System.out.println("Ingresa el ancho ");
        double B = input.nextDouble();
        double Area = A*B;
        System.out.println("El area es: " + Area );
        opcion = 0;
      }
      else if (opcion == 2){
        System.out.println("Circunferencia de un circulo" + "\n" +
        "\t" + "Ingresa el radio ");
        double R = input.nextDouble();
        double Area = Math.PI*(Math.pow (R, 2));
        System.out.println("El area es: " + Area );
        opcion = 0;
      }
      else if (opcion == 3){
        System.out.println("\n Area de un terreno irregular" + "\n" +
        "\t" + "Ingresa la altura del triangulo y rectangulo unidos ");
        double A = input.nextDouble();
        System.out.println("\n Ingresa la base del trangulo y del rectangulo ");
        double B = input.nextDouble();
        System.out.println( "\n Ingresa la altura del rectangulo ");
        double C = input.nextDouble();
        double AT = (C * (A-C))/2;
        double AR = B * C;
        double Area = AT + AR;
        System.out.println("Esta es el area del triangulo: " + AT + "\n" +
        "\t" + "Esta es el area del rectangulo: " + AR + "\n" +
        "\t" + "Este el el area general de la figura: " + Area);
        opcion = 0;
      }
      else if (opcion == 4){
        System.out.println("Area de cono helado \n" +
        "\t" + "Ingresa la base del triangulo rectangulo y radio");
        double R = input.nextDouble();
        System.out.println("Hipotenusa del triangulo rectangulo");
        double H = input.nextDouble();
        double C =Math.sqrt ((Math.pow(H, 2))-(Math.pow(R, 2)));
        double AT = (R * C)/2;
        double AC = (Math.PI * (Math.pow (R, 2))) /2;
        double Area = AT + AC;
        System.out.println("El area superior del afigura es igual a: " + AC + "\n" +
        "\t" + "El cateto faltante es: " + C + "\n" +
        "\t"+ "EL area de la parte inferios del cono es igual a: " + AT + "\n" +
        "\t" + "El area total es igual a: " + Area);
        opcion = 0;
      }
      else if (opcion == 5){
        System.out.println("Cantidad de litros por galon" + "\n" +
        "\t" + "Ingresa la cantidad de litros que produce");
        double L = input.nextDouble();
        System.out.println("Ingresa el precio por galon");
        double PG = input.nextDouble();
        double TG = L / 3.785;
        double GA = PG * TG;
        System.out.println("Se produgeron: " + TG + " galones\n" +
        "\t" + "Se ganaron: " + GA);
        opcion = 0;
      }
      else if (opcion == 6){
        System.out.println("Sueldo ganado por semana" + "\n" +
        "\t" + "Ingresa las horas que trabajo durante la semana");
        double HT = input.nextDouble();
        System.out.println("Ingresa el pago por hora");
        double PH = input.nextDouble();
        double SS = HT*PH;
        System.out.println("Usted gano : " + SS + " esta semana");
        opcion = 0;
      }
      else if (opcion == 7){
        System.out.println("Conversion de metros a pulgadas por rollo de tela" + "\n" +
        "\t" + "Ingresa la cantidad de metros que requiera");
        double CM = input.nextDouble();
        double PG = CM / 0.0254;
        System.out.println("Se necesitaran: " + PG + " pulgadas");
        opcion = 0;
      }
      else if (opcion == 8){
        System.out.println("Pago que realizaras por metros cubicos consumidos por alberca" + "\n" +
        "\t" + "Ingresa la altura de la alberca");
        double A = input.nextDouble();
        System.out.println("Ingresa el largo de la alberca");
        double L = input.nextDouble();
        System.out.println("Ingresa el ancho de la alberca");
        double N = input.nextDouble();
        System.out.println("Ingresa el precio por metro cubico");
        double CM = input.nextDouble();
        double V = A*L*N;
        double PAG = V*CM;
        System.out.println("El volumen total de la alberca es: " + V + " metros cubicos\n" +
        "\t" + "El pago que realizara sera de: " + PAG);
        opcion = 0;
      }
    }
    System.out.println("Gracias por usar mi programa. Adiooos");
    }
  }
