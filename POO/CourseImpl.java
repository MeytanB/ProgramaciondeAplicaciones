import javax.swing.*;
  public class CourseImpl{
    public static void main(String[] args) {
      Course curso1 = new Course();
      //curso1.CourseName = "Ingles";
      curso1.setCourseName("Ingles");

      curso1.addStudent("Luis");
      curso1.addStudent("Alndra");
      curso1.addStudent("Manuela");

      String[] studentsDeIngles = curso1.getStudents();
      String students = "";
      for (int i = 0; i < curso1.getNumberOfStudents(); i++){
        students += studentsDeIngles[i] + "\n";
      }
      JOptionPane.showMessageDialog(null, students);
      
      Course curso2 = new Course();
      curso2.setCourseName ("Mate");

      curso2.addStudent("Israel");
      curso2.addStudent("Angel");
      curso2.addStudent("Yo");

      JOptionPane.showMessageDialog(null, curso1.getCourseName());
      //JOptionPane.showMessageDialog(null, curso1.getStudents());
      JOptionPane.showMessageDialog(null, curso2.getCourseName());

  }
}
