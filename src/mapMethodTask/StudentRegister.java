package mapMethodTask;

import java.util.HashMap;

public class StudentRegister  {
    private HashMap<Integer, Student> registry;
    public StudentRegister(){
        registry = new HashMap<>();

    }
    //Telebe elave etmek
    public void addStudent(Student student){
        registry.put(student.getId(), student);
    }
    //ID gore telebe axtar
    public Student getStudent(int id){
        return registry.get(id);
    }
    //
    public void removeStudent(int id){
        registry.remove(id);
    }


}
