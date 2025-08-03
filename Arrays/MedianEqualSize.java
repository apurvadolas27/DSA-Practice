//Median of 2 sorted arrays of equal size
import java.util.Arrays;
public class MedianEqualSize {
     
    public static double Median(int[]a, int[]b){
        int n = a.length;
        int[] merged = new int[2*n];
        int i=0, j=0, k=0;

        while (i<n && j<n) {
            if(a[i]<b[j]){
                merged[k++] = a[i++];
            }
            else{
                merged[k++] = b[j++];
            }
        
        }

        while (i<n) {
            merged[k++]=a[i++];
        }
        while (j<n) {
            merged[k++]=a[j++];
        }

        return(merged[n-1] + merged[n])/2.0;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};

        System.out.println("Median : " + Median(arr1, arr2));
    }
}
