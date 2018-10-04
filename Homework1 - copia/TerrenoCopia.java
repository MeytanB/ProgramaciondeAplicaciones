import javax.swing.JOptionPane;;

  public class TerrenoCopia{
    public static void main(String[] args) {
      double A = Double.parseDouble(JOptionPane.showInputDialog(null, "\n Area de un terreno irregular" + "\n" +
      "\t" + "Ingresa la altura del triangulo y rectangulo unidos "));
      double B = Double.parseDouble(JOptionPane.showInputDialog(null, "\n Ingresa la base del trangulo y del rectangulo "));
      double C = Double.parseDouble(JOptionPane.showInputDialog(null, "\n Ingresa la altura del rectangulo "));
      double AT = (C * (A-C))/2;
      double AR = B * C;
      double Area = AT + AR;
      JOptionPane.showMessageDialog(null, "Esta es el area del triangulo: " + AT + "\n" +
      "\t" + "Esta es el area del rectangulo: " + AR + "\n" +
      "\t" + "Este el el area general de la figura: " + Area);
   }
}
