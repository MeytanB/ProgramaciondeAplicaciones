import javax.swing.JOptionPane;
public class DogImplement{
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.color = "black";
    fido.eyeColor = "blue";
    fido.Height = 0.50d;
    fido.weight = 30.0d;
    Dog chilaquil = new Dog();
    chilaquil.color = "brown";
    chilaquil.eyeColor = "green";
    chilaquil.Height = 0.78d;
    chilaquil.weight = 25.0d;
    JOptionPane.showMessageDialog(null, "FIDO es de color: " + fido.color);
    JOptionPane.showMessageDialog(null, "Chilaquil es de color: " + chilaquil.color);
    //Trae un valor guardado
    System.out.println(fido.sit());
    fido.sit();
    fido.layDown("Mi nombre es fido ");
    fido.sleep();
  }
}
