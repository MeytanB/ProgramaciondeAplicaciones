import javax.swing.JOptionPane;

  public class DoWhileLoop{
   public static void main(String[] args) {
     int data;
     int sum = 0;
     do{
       data = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value the program exits if teh input is 0"));
      sum = sum + data;
     }
     while(data != 0);
     JOptionPane.showMessageDialog(null, "the sum is: " + sum);
   }
  }
