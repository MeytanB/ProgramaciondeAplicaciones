import java.util.Scanner;
import java.lang.Math;
  public class ComputerBMI{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final double KILOGRAMS_PER_PUND = 0.4535923;
      final double METERS_PER_INCH = 0.0254;
      //final es para constantes si son de 2 a mas palabras se usa guion bajo
        System.out.println("Enter weight in pounds: ");
        double Weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double Height = input.nextDouble();
        double WeightInKilograms = Weight * KILOGRAMS_PER_PUND;
        double HeightInMeters = Height * METERS_PER_INCH;
        double BMI = WeightInKilograms / (Math.pow (HeightInMeters, 2));
        System.out.println("Your BMI is: " + BMI);
    }
  }
