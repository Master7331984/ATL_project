package Education;

public class Student extends University {
    int student_id;
    String student_name;
    String course;

    public Student(String uni_name, String uni_address, String student_name, String course) {
        super(uni_name, uni_address);

        this.student_name = student_name;
        this.course = course;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void study(){
        System.out.println("University: " + uni_name+" Student id: "+""+student_id +" " +"Student name:"+" " +student_name +" "+ "Course:" +" "+ course);


    }
}
