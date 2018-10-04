import javax.swing.JOptionPane;;

  public class SueldoCopia{
    public static void main(String[] args) {
      double HT = Double.parseDouble(JOptionPane.showInputDialog(null, "Sueldo ganado por semana" + "\n" +
      "\t" + "Ingresa las horas que trabajo durante la semana"));
      double PH = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el pago por hora"));
      double SS = HT*PH;
      JOptionPane.showMessageDialog(null, "Usted gano : " + SS + " esta semana");
    }
 }
