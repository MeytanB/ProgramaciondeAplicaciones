import javax.swing.JOptionPane;;

  public class RectanguloCopia{
    public static void main(String[] args) {
      double A = Integer.parseInt(JOptionPane.showInputDialog(null, "Quieres saber el area de un rectangulo" + "\n" +
      "\t" + "Ingresa la altura "));
      double B = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el ancho "));
      double Area = A*B;
      JOptionPane.showMessageDialog(null, "El area es: " + Area );
    }
  }
