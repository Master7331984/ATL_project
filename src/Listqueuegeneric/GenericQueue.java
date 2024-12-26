package Listqueuegeneric;

import java.util.PriorityQueue;
import java.util.Queue;

public class GenericQueue<T> {
    Queue<T> queue = new PriorityQueue<>();
    public void enqueue(T t){
        queue.add(t);
    }
    public void dequeue(){
        queue.poll();
    }
    public void isEmpty(){
        try{
            queue.element();
        }catch (Exception e){
            System.out.println("List bosdur");
        }
    }
    public void displayInfo(){
        queue.forEach(System.out::println);
    }


    public GenericQueue() {
    }

}
