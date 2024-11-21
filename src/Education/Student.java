package Education;

public class Student extends University {
    int student_id;
    String student_name;
    int course_id;

    public Student(int uni_id, String address, int student_id, int course_id, int teacher_id, String subject) {
        super(uni_id, address, student_id, course_id, teacher_id, subject);
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
    public void study(){
        System.out.println("Student id: " + " " +student_id +" " +"Student name:"+" " +student_name +" "+ "Course:" +" "+ course_id);

    }
}
