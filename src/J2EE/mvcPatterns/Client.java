package J2EE.mvcPatterns;

import java.util.ConcurrentModificationException;

public class Client {
    public static void main(String[] args) {
        Student student = retriveData();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();

        studentController.setStudentName("bob");

        studentController.updateView();
    }

    private static Student retriveData() {
        Student student = new Student();
        student.setName("jack");
        student.setAge(55);
        return  student;
    }
}
