import java.util.Scanner;

public class CharPattern {
   public static void main(String[] args) {
     Scanner src = new Scanner(System.in);
     char ch='A';
        System.out.println("Enter no. of rows :");
        int row = src.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
   }
}