import javax.swing.JOptionPane;

  public class SentinelValue{
    public static void main(String[] args) {
      int sum = 0;
      int Data = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value ( El programa existe SI el valor es 0)"));
      while (Data != 0){
        while(Data != 0){
          sum++;
          Data = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value ( El programa existe SI el valor es 0)"));
        }
      }
      JOptionPane.showMessageDialog(null, " sum= "  + sum);
    }
  }
