import javax.swing.JOptionPane;

  public class WhileLoop{
    public static void main(String[] args) {
      int number = (int)(Math.random()*100 );
      int Guess = -1;
      while(Guess != number){
        Guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a magic number between 0 and 100"));
        if (Guess == number){
          JOptionPane.showMessageDialog(null, "Yes, the number is " + number);
        }
        else if (Guess > number){
          JOptionPane.showMessageDialog(null, "Your guess is too high");
        }
        else {
          JOptionPane.showMessageDialog(null, "Your guess is too low");
        }
      }
    }
  }
