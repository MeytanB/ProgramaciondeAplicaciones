import javax.swing.JOptionPane;

  public class ViajeDeEstudiosCopia{
    public static void main(String[] args){
    int NA = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos asistiran"));
    int PA;
    int TOT;
    if(NA > 99){
      PA = 65;
      JOptionPane.showMessageDialog(null, "Se pagaran 65 por alumno");
      TOT = NA * PA;
      JOptionPane.showMessageDialog(null, "El pago total sera de: " + TOT);
    }
    else if (NA > 49){
      PA = 70;
      JOptionPane.showMessageDialog(null, "Se pagaran 70 por alumno");
      TOT = NA * PA;
      JOptionPane.showMessageDialog(null, "El pago total sera de: " + TOT);
    }
    else if (NA > 29){
      PA = 95;
      JOptionPane.showMessageDialog(null, "Se pagaran 95 por alumno");
      TOT = NA * PA;
      JOptionPane.showMessageDialog(null, "El pago total sera de: " + TOT);
    }
    else{
      JOptionPane.showMessageDialog(null, "Se tendra que pagar el total de 4000 por el autobus");
    }
    }
  }
