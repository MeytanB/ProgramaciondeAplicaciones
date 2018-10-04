  public class Dog{
    //propiedades o atributos
    String color;
    String eyeColor;
    double Height;
    Double lenght;
    Double weight;
    //Metodos o comportamientos
    public String sit(){
      //para retornar un dato es necesario usar return, se guardara y no se mostrara
      return "Estoy sentado";
      //System.out.println("Estoy sentado");
    }
    public void bark(){
      System.out.println("wauff wauff wauff");
    }
    public void layDown(String name){
      System.out.println(name + "Estoy recostado");
    }
    public void eat(){
      System.out.println("I am eating");
    }
    public void sleep(){
      System.out.println("Z Z Z Z Z Zzzzzz ZZZZZZZ");
    }
  }
