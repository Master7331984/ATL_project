package Education;

public class University {

    String uni_name;
    String uni_address;
    private int studentCount;
    private Student[] students;



    public University( String uni_name, String uni_address) {

        this.uni_name = uni_name;
        this.uni_address = uni_address;
    }



    public String getUni_name() {
        return uni_name;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    public String getUni_address() {
        return uni_address;
    }

    public void setUni_address(String uni_address) {
        this.uni_address = uni_address;
    }

    public void setAddress(String address) {
        this.uni_address = address;
    }

    public void displayMessage() {
        System.out.println("University: " + " " + uni_name + " " + "University address:" + " " + uni_address);

    }
}


