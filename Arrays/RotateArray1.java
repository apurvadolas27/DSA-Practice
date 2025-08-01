// Rotate Array left by kth position

public class RotateArray1 {
    
    static void reverse(int a[], int s, int e){
        int start = s;
        int end = e;
        while (start<end) {
            int temp = a[start];
            a[start]= a[end];
            a[end]= temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println(java.util.Arrays.toString(a));

        int k = 17;
        k = k % a.length;

        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);

        System.out.print(java.util.Arrays.toString(a));

    }
}
