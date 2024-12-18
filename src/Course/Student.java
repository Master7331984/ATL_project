package Course;

import java.util.ArrayList;
import java.util.List;

public class Student {
     private int StudentId;
     private String StudentName;
     List<Course> students;
     boolean isExist;
    //add, remove, isExist, isNotExist


    public Student(int studentId, String studentName, List<Course> students, boolean isExist) {
        StudentId = studentId;
        StudentName = studentName;

        this.isExist = isExist;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public List<Course> getStudents() {
        return students;
    }

    public void setStudents(List<Course> students) {
        this.students = students;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public void addStudents(List<Student> students){
        //students.add();




    }
    public void removeStudents(List<Student> students){

    }
}

