import java.util.Scanner;

public class Dinamik_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = scanner.nextInt();
        int[] oldArr = new int[10];
        int[] newArr = new int[size];

        for (int i=0; i<oldArr.length; i++){
            oldArr[i]= newArr[i];
        }
        System.out.println();

    }
}
