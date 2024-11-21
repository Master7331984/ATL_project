package Education;

public class University {
    int uni_id;
    String address;


    public University(int uni_id, String address, int student_id, int course_id, int teacher_id, String subject) {
        this.uni_id = uni_id;
        this.address = address;

    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayMessage(){
        System.out.println("University id:" + " " + uni_id+ " "+ "University address:" + " " + address);

    }
}
