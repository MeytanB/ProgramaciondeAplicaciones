import javax.swing.JOptionPane;

  public class ConaguaCopia{
    public static void main(String[] args) {
      double A =Integer.parseInt(JOptionPane.showInputDialog(null, "Pago que realizaras por metros cubicos consumidos por alberca" + "\n" +
      "\t" + "Ingresa la altura de la alberca"));
      double L = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el largo de la alberca"));
      double N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el ancho de la alberca"));
      double CM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el precio por metro cubico"));
      double V = A*L*N;
      double PAG = V*CM;
      JOptionPane.showMessageDialog(null, "El volumen total de la alberca es: " + V + " metros cubicos\n" +
      "\t" + "El pago que realizara sera de: " + PAG);
    }
 }
