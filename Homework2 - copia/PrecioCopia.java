import javax.swing.JOptionPane;

  public class PrecioCopia{
    public static void main(String[] args){
    int Num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lapices a comprar"));
    double Pag;
    if (Num > 0 && Num < 1000){
      Pag = Num * 0.90;
      JOptionPane.showMessageDialog(null, "Usted pagara 90 centavos por lapiz");
    }
    else{
      Pag = Num * 0.85;
      JOptionPane.showMessageDialog(null, "Usted pagara 85 centavos por lapiz");
    }
    JOptionPane.showMessageDialog(null, "Usted pagara: " + Pag + " en total por comprar " + Num + " Lapices");
    }
  }
