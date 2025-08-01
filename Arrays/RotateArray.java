// Rotate Array left by 1 position

public class RotateArray {
    public static void main(String[] args) {
        
        int a[] = {5, 8, 3, 2, 6};
        int temp = a[0];

        for (int i= 1; i<=a.length-1; i++){
            a[i-1]=a[i];
        }

        a[a.length-1]=temp;

        for(int i:a){
            System.out.print(i + " ");
        }
    }
}
