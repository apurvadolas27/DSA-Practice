// Find the missing number from 1 to n

public class ExpectedSum {
    public static void main(String[] args) {
        
        int a[] = {1, 2, 4, 5, 6, 7};
        int N= 7;
        int sum= 0;
        
        int expectedSum = (N*(N+1)/2);

        for(int i:a){
            sum=sum+i;
        }

        int missingN0= (expectedSum - sum);
        System.out.println(missingN0); 
    }
}
