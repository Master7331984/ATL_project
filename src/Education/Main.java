package Education;

public class Main {
    public static void main(String[] args) {


        University university = new University("BDU","Nizami street");
        university.displayMessage();
        Student student = new Student("BSU","Fuzuli street","Ahmad","Physics");
        student.study();
        Teacher teacher = new Teacher("ADSU","Xaqani street", 1,"Aysel","Chemistry");
        teacher.teach();

        //Student student1 = new Student("BSU", "Fuzuli street","Dashgin","Chemistry");



    }
}
