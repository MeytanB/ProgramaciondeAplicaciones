import javax.swing.JOptionPane;
import java.lang.Math;

  public class CirculoCopia{
    public static void main(String[] args) {
      double R =Integer.parseInt(JOptionPane.showInputDialog(null, "Circunferencia de un circulo" + "\n" +
      "\t" + "Ingresa el radio "));
      double Area = Math.PI*(Math.pow (R, 2));
      JOptionPane.showMessageDialog(null, "El area es: " + Area );
    }
  }
