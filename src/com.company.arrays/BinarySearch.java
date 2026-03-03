import java.lang.reflect.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,3,4,6,7,9,11};
        int key = 4;
        int start = 0 ;
        int end = arr.length-1;
        boolean found = false;
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==key){
                found = true;
                System.out.println("Found at index "+mid);
                break;
            }else if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }     
        }

        if(!found){
            System.out.println("Not Found!");
        }
        }
}
