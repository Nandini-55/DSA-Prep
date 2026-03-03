import java.util.Scanner;

public class StarPaterrn {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no. of rows :");
        int row = src.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
