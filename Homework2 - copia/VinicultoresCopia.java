import javax.swing.JOptionPane;

  public class VinicultoresCopia{
    public static void main(String[] args){
    final String Tipo = "A";
    final String Tipoo = "B";
    String TI = JOptionPane.showInputDialog("Ingrese A o B dependiendo del tipo de uva");
    int TA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamallo de la uva"));
    int K = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en kilos de uva"));
    double P = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por kilo de uva"));
    double GA;
    if (Tipo.equals(TI) && TA == 1){
      GA = (P * K) + (K * 0.20);
      JOptionPane.showMessageDialog(null, "El precio inicial agregado por kilo sera de 20 centavos");
    }
    else if (Tipo.equals(TI) && TA == 2){
      GA = (P * K) + (K * 0.30);
      JOptionPane.showMessageDialog(null, "El precio inicial agregado por kilo sera de 30 centavos");
    }
    else if (Tipoo.equals(TI) && TA == 1){
      GA = (P * K) + (K * -0.30);
      JOptionPane.showMessageDialog(null, "El precio inicial rebajado por kilo sera de 30 centavos");
    }
    else {
      GA = (P * K) + (K * -0.50);
      JOptionPane.showMessageDialog(null, "El precio inicial rebajado por kilo sera de 50 centavos");
    }
    JOptionPane.showMessageDialog(null, "La ganacia total sera de: " + GA);
    }
  }
