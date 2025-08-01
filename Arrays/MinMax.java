// Find the maximum and minimum element in an array

public class MinMax {
    public static void main(String[] args) {
        
        int a[] = { 20, 10, 60, 100, 50};
        int max = a[0], min = a[0];

        for (int i = 1; i <= a.length-1; i++){

            if(a[i] > max){
                max = a[i];
            }

            else if (a[i] < min){
                min = a[i];
            }

        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        
    }
}
