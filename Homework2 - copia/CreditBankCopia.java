import javax.swing.JOptionPane;

  public class CreditBankCopia{
    public static void main(String[] args) {
      double TT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu tipo de targeta que desea aumentar su credito"));
      double LA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el limite actual de tu targeta"));
      double AC;
      if (TT == 1)
      AC = 1.25;
      else if (TT == 2)
      AC = 1.35;
      else if (TT == 3)
      AC = 1.40;
      else
      AC = 1.50;
      double NC = LA * AC;
      JOptionPane.showMessageDialog(null, "Su nuevo limite de credito es: " + NC);
    }
  }
