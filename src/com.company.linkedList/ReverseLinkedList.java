import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no. of employee : ");
        int n = src.nextInt();
        System.out.println("Enter ids: ");
        for (int i = 0; i < n; i++) {
            ll.add(src.nextInt());
        }

        System.out.println(ll);
    }
}
