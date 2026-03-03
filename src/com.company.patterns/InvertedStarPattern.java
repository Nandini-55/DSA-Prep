import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no, of rows : ");
        int row = src.nextInt();
        for(int i=row;i>0;i--){
            for(int j=0 ;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
