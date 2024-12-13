package NewsWithGenerics;

public class Author<N> {
    private N name;
    private N surname;

    public Author(N name, N surname) {
        this.name = name;
        this.surname = surname;
    }

    public N getName() {
        return name;
    }

    public N getSurname() {
        return surname;
    }
    public String fullName(){
        return getName()+ " "+ getSurname();
    }
}
