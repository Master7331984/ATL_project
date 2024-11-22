package Education;

public class Main {
    public static void main(String[] args) {


        University university = new University(1, "BDU", "Nizami street");
        university.displayMessage();
        Student student = new Student(1,"Alim", "Fuzulu street",1,"Melik", 4);
        student.study();
        Teacher teacher = new Teacher(1, "ASUA", "Xaqani streat",2,"Aysel","Informatics");
        teacher.teach();

    }
}
