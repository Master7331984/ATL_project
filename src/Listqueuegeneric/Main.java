package Listqueuegeneric;

public class Main {
    public static void main(String[] args) {
        GenericQueue a1 = new GenericQueue();
        a1.enqueue("Football");
        a1.enqueue("Basketball");
        a1.enqueue("Tennis");
        a1.dequeue();
        a1.dequeue();
        a1.dequeue();
        a1.isEmpty();
        a1.displayInfo();
    }
}
