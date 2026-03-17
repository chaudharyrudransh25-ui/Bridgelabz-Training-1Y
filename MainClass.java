import college.student.Student;
import college.faculty.Faculty;
public class MainClass{
    public static void main(String[] args){
        Student s1 = new Student("Piyush", 101);
        Faculty f1 = new Faculty("tanmay sir", "Java");

        s1.displayStudent();
        f1.displayFaculty();
    }
}