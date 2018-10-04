import javax.swing.JOptionPane;

  public class ConsultorioCopia{
    public static void main(String[] args) {
    int NC = Integer.parseInt(JOptionPane.showInputDialog("Cuantas citas de seguimineto de tratamineto se necesitan"));
    int CC;
    if (NC < 4){
      CC = 200;
      JOptionPane.showMessageDialog(null, "El costo por cita sera de 200");
    }
    else if (NC < 6){
      CC = 150;
      JOptionPane.showMessageDialog(null, "El costo por cita sera de 150");
    }
    else if (NC < 10){
      CC = 100;
      JOptionPane.showMessageDialog(null, "El costo por cita sera de 100");
    }
    else{
      CC = 50;
      JOptionPane.showMessageDialog(null, "El costo por cita sera de 50");
    }
    int TOT = CC * NC;
    JOptionPane.showMessageDialog(null, "El costo del tratamineto sera de: " + TOT);
    }
  }
