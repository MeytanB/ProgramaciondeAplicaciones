import javax.swing.JOptionPane;

  public class MayorQueCopia{
    public static void main(String[] args){
    int A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
    int B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    int M;
    if (A > B){
      M = A;
    }
    else{
      M = B;
    }
    JOptionPane.showMessageDialog(null, "El numero mayor es el: " + M);
    }
  }
