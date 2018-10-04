import javax.swing.JOptionPane;

  public class TelasCopia{
    public static void main(String[] args) {
      double CM = Double.parseDouble(JOptionPane.showInputDialog("Conversion de metros a pulgadas por rollo de tela" + "\n" +
      "\t" + "Ingresa la cantidad de metros que requiera"));
      double PG = CM / 0.0254;
      JOptionPane.showMessageDialog(null, "Se necesitaran: " + PG + " pulgadas");
    }
 }
