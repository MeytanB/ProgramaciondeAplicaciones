import javax.swing.JOptionPane;

  public class TelefonicaCopia{
    public static void main(String[] args){
    final String DIH = "Domingo";
    final String TUD = "Vespertino";
    int TI = Integer.parseInt(JOptionPane.showInputDialog("Cuantos minutos hablastes"));
    double PAG;
    double IMP;
    if (TI < 6){
      PAG = 1;
      JOptionPane.showMessageDialog(null, "Usted pagara 1 por minuto");
    }
    else if (TI < 9){
      PAG = 0.80;
      JOptionPane.showMessageDialog(null, "Usted pagara 0.80 por minuto");
    }
    else if (TI < 11){
      PAG = 0.70;
      JOptionPane.showMessageDialog(null, "Usted pagara 0.70 por minuto");
    }
    else{
      PAG = 0.50;
      JOptionPane.showMessageDialog(null, "Usted pagara 0.50 por minuto");
    }
    String DI = JOptionPane.showInputDialog("Que dia es");
    if (DIH.equals(DI)){
      IMP = 0.97;
    }
    else{
      String TU = JOptionPane.showInputDialog("Que turno es");
      if (TUD.equals(TU)){
        IMP = 0.85;
      }
      else{
        IMP = 0.90;
      }
    }
    double TOT = (PAG * TI) * IMP;
    JOptionPane.showMessageDialog(null, "El pago por tu llamada es de:" + TOT);
    }
  }
