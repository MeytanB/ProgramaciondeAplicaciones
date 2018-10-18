import javax.swing.*;
  public class CourseDoWhile{
    public static void main(String[] args) {
      int opc = 0;
      Course curso1 = new Course();
      do{
        switch(opc){
        case 1:
        curso1.setCourseName(JOptionPane.showInputDialog(null, "Ingresa el nombre del curso"));
        opc = 0;
        break;
        case 2:
        curso1.addStudent(JOptionPane.showInputDialog(null, "Ingresa el nombre del estudiante"));
        opc = 0;
        break;
        case 3:
        String drop =JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno que deceas eliminar");
        curso1.dropStudent(drop);
        opc = 0;
        break;
        case 4:
        String[] studentsDeIngles = curso1.getStudents();
        String students = "";
        for (int i = 0; i < curso1.getNumberOfStudents(); i++){
          students += studentsDeIngles[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, students);
        opc = 0;
        break;
        case 5:
        JOptionPane.showMessageDialog(null, curso1.getNumberOfStudents());
        opc = 0;
        break;
        default:
          opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Que accion decea relaizar\n" +
          " 1 = crear curso\n" +
          " 2 = Agregar Estudiantes\n" +
          " 3 = Eliminar estudinates\n" +
          " 4 = mostrar estudiantes\n" +
          " 5 = mostrar numero de estudiantes\n" +
          " 6 = Salir\n"));
        }
      }while(opc < 6);
      String[] studentsDeIngles = curso1.getStudents();
      String students = "";
      for (int i = 0; i < curso1.getNumberOfStudents(); i++){
        students += studentsDeIngles[i] + "\n";
      }
      JOptionPane.showMessageDialog(null, "El curso es: " + curso1.getCourseName() + "\n" +
      "Los estudiantes son \n" + students +
      "Son un total de: " + curso1.getNumberOfStudents() + " estudiante(s)");
    }
  }
