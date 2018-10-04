import javax.swing.JOptionPane;

  public class LitroPorGalonCopia{
    public static void main(String[] args) {
      double L = Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad de litros por galon" + "\n" +
      "\t" + "Ingresa la cantidad de litros que produce"));
      double PG = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio por galon"));
      double TG = L / 3.785;
      double GA = PG * TG;
      JOptionPane.showMessageDialog(null, "Se produgeron: " + TG + " galones\n" +
      "\t" + "Se ganaron: " + GA);
    }
 }
