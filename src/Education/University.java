package Education;

public class University {
    int uni_id;
    String uni_name;
    String uni_address;


    public University(int uni_id, String uni_name, String uni_address) {
        this.uni_id = uni_id;
        this.uni_name = uni_name;
        this.uni_address = uni_address;
    }



    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
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
        System.out.println("University id:" + " " + uni_id + " " + "University address:" + " " + uni_address);

    }
}


