package Education;

public class Student extends University {
    int student_id;
    String student_name;
    int course_id;

    public Student(int uni_id, String uni_name, String uni_address, int student_id, String student_name, int course_id) {
        super(uni_id, uni_name, uni_address);
        this.student_id = student_id;
        this.student_name = student_name;
        this.course_id = course_id;
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
        System.out.println("Student id: " + " " +student_id +" " +"Student name:"+" " +student_name +" "+ "Course:" +" "+ course_id+
                "University:"+" "+super.uni_id + "University name"+" "+super.uni_name + "University address"+" " +super.uni_address);

    }
}
