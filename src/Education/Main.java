package Education;

public class Main {
    public static void main(String[] args) {


        University university = new University(1, "Nizami street", 1, 4, 2, "Informatika");
        university.displayMessage();
        Student student = new Student(2, "Reshid Behbudov", 2, 3, 12, "Tarix");
        student.study();
        Teacher teacher = new Teacher(1, "Uzeyir Hacibeyov", 2, 3, 5, "Fizika");
        teacher.teach();

    }
}
