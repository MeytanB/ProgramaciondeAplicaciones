import javax.swing.JOptionPane;
import java.lang.Math;

  public class ConoCopia{
    public static void main(String[] args) {
      double R = Double.parseDouble(JOptionPane.showInputDialog(null, "Area de cono helado \n" + "\t" + "Ingresa la base del triangulo rectangulo y radio"));
      double H = Double.parseDouble(JOptionPane.showInputDialog("Hipotenusa del triangulo rectangulo"));
      double C =Math.sqrt ((Math.pow(H, 2))-(Math.pow(R, 2)));
      double AT = (R * C)/2;
      double AC = (Math.PI * (Math.pow (R, 2))) /2;
      double Area = AT + AC;
      JOptionPane.showMessageDialog(null, "El area superior del afigura es igual a: " + AC + "\n" +
      "\t" + "El cateto faltante es: " + C + "\n" +
      "\t"+ "EL area de la parte inferios del cono es igual a: " + AT + "\n" +
      "\t" + "El area total es igual a: " + Area);
   }
}
