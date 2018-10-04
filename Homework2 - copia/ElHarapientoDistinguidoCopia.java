import javax.swing.JOptionPane;

  public class ElHarapientoDistinguidoCopia{
    public static void main(String[] args){
    int CT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del traje"));
    double DE;
    double PF;
    if (CT > 2500){
      DE = 0.85;
      JOptionPane.showMessageDialog(null, "Usted tendra un descuento del 15%");
    }
    else{
      DE = 0.92;
      JOptionPane.showMessageDialog(null, "Usted tendra un descuento del 8%");
    }
    PF = CT * DE;
    JOptionPane.showMessageDialog(null, "EL precio final por el traje sera de: " + PF);
    }
  }
