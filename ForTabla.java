import javax.swing.JOptionPane;

  public class ForTabla{
    public static void main(String[] args) {
      int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tabla deseas saber"));
      while (i > 0 && i <=9){
        String salida="";
        for (int j = 0; j <= 9; j++){
        //System.out.println("i x " + (i + 1) + " = " + (i + 1)*1 );
        //JOptionPane.showMessageDialog(null, + i+ " x " + (j + 1) + " = " + (j + 1)*i );
          salida += i + " x " + (j + 1) + " = " + (j + 1)*i +"\n";
       }
      JOptionPane.showMessageDialog(null, salida);
      i = Integer.parseInt(JOptionPane.showInputDialog(null, "Quieres saber otra tabla si no ingresa 0"));
      }
    }
  }
