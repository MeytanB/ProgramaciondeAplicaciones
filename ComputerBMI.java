import java.util.Scanner;

  public class ComputerBMI{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final double KILOGRAMS_PER_PUND = 0.4535923;
      final double METERS_PER_INCH = 0.0254;
      //final es para constantes si son de 2 a mas palabras se usa guion bajo
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double Height = input.nextDouble();
        double weightInKilograms = weight * KILOGRAMS_PER_PUND;
        double HeightInMeters = Height * METERS_PER_INCH;
        double BMI = 
    }
  }
