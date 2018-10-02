import javax.swing.JOptionPane;;

  public class SueldoCopia{
    public static void main(String[] args) {
      double HT = Integer.parseInt(JOptionPane.showInputDialog(null, "Sueldo ganado por semana" + "\n" +
      "\t" + "Ingresa las horas que trabajo durante la semana"));
      double PH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el pago por hora"));
      double SS = HT*PH;
      JOptionPane.showMessageDialog(null, "Usted gano : " + SS + " esta semana");
    }
 }
