package NewsWithGenerics;

public class Category <C>{
    private C name;

    public Category(C name) {
        this.name = name;
    }

    public C getName() {
        return name;
    }

    public void setName(C name) {
        this.name = name;
    }
}
