//Move all the negative elements to one side of the array 
import java.util.Arrays;

public class NegNumber {

   static int[] move(int[] arr) {
        Arrays.sort(arr);     
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {7, 23, -1, -5, 100, -9};
        int[] arr = move(a);

        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }



    
}
