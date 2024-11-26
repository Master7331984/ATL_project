package Education;

public class Teacher extends University {
    int teacher_id;
    String teacher_name;
    String subject;

    public Teacher(int uni_id, String uni_name, String uni_address, int teacher_id, String teacher_name, String subject) {
        super(uni_name, uni_address);
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.subject = subject;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println("Teacher number:" + " " +teacher_id+ " " +"Teacher name:" +teacher_name + " " + "Subject:" + " " +subject);

    }
}
