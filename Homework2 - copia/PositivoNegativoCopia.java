import javax.swing.JOptionPane;

  public class PositivoNegativoCopia{
    public static void main(String[] args){
    int Num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
    if (Num > 0){
      JOptionPane.showMessageDialog(null, "El numero " + Num + " es POSITIVO");
    }
    else if (Num < 0){
      JOptionPane.showMessageDialog(null, "El numero " + Num + " es NEGATIVO");
    }
    else{
      JOptionPane.showMessageDialog(null, "Tu numero es cero asi que mucha y mucha");
    }
    }
  }
