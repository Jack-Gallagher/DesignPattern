package J2EE.mvcPatterns;

import cloneDemo.Things;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        this.model.setName(name);
    }

    public void setStudentAge(int age){
        this.model.setAge(age);
    }

    public int getStudentAge(){
        return model.getAge();
    }

    public String getStudentName(){
        return model.getName();
    }

    public void updateView(){
        this.view.printInfo(model.getName(), model.getAge());
    }
}
