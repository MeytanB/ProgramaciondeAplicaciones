import javax.swing.JOptionPane;

  public class LaLangostaAhumadaCopia{
    public static void main(String[] args){
    int NP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero total de personas que acistiran al banquete"));
    int TOT;
    if (NP > 0 && NP < 200){
      TOT = NP * 95;
      JOptionPane.showMessageDialog(null, "El costo por persona sera de 95");
    }
    else if (NP > 199 && NP < 300){
      TOT = NP * 85;
      JOptionPane.showMessageDialog(null, "El costo por persona sera de 85");
    }
    else{
      TOT = NP * 75;
      JOptionPane.showMessageDialog(null, "El costo por persona sera de 75");
    }
    JOptionPane.showMessageDialog(null, "El pago total por el banquete sara de: " + TOT);
    }
  }
