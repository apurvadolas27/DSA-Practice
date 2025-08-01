public class ReverseArray {
    public static void main(String[] args) {
        
        int a[] = {2, 6, 9, 3, 5};

        System.out.println("Before");
        for(int i = 0; i <= a.length-1; i++){
            System.out.print(a[i] + " ");
        }

        System.out.print("\n");

        System.out.println("After");
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
    
}
