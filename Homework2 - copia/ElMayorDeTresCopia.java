import javax.swing.JOptionPane;

  public class ElMayorDeTresCopia{
    public static void main(String[] args) {
      int Uno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
      int Dos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
      int Tres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
      if ((Uno > Dos) && (Uno > Tres) && (Dos > Tres))
      JOptionPane.showMessageDialog(null, "El numero mayo es: " + Uno + " El intermedio es: " + Dos + " y el numero menor es: " + Tres);
      else if ((Uno > Dos) && (Uno > Tres) && (Tres > Dos))
      JOptionPane.showMessageDialog(null, "El numero mayo es: " + Uno + " El intermedio es: " + Tres + " y el numero menor es: " + Dos);
      else if ((Dos > Uno) && (Dos > Tres) && (Uno > Tres))
      JOptionPane.showMessageDialog(null, "El numero mayo es: " + Dos + " El intermedio es: " + Uno + " y el numero menor es: " + Tres);
      else if ((Dos > Uno) && (Dos > Tres) && (Tres > Uno))
      JOptionPane.showMessageDialog(null, "El numero mayo es: " + Dos + " El intermedio es: " + Tres + " y el numero menor es: " + Uno);
      else if ((Tres > Uno) && (Tres > Dos) && (Dos > Uno))
      JOptionPane.showMessageDialog(null, "El numero mayo es: " + Tres + " El intermedio es: " + Dos + " y el numero menor es: " + Uno);
      else
      JOptionPane.showMessageDialog(null, "El numero mayo es: " + Tres + " El intermedio es: " + Uno + " y el numero menor es: " + Dos);
    }
  }
