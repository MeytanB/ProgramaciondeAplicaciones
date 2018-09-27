import javax.swing.JOptionPane;

  public class Factorial{
    public static void main(String[] args) {
      int Value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value"));
      int Fact = 1;
      int i = 1;
      while(i <= Value){
        Fact = Fact * i;
        i++;
      }
      JOptionPane.showMessageDialog(null, "The fact is " + Fact);
    }
  }
