
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintDuplicate {
    public static void main(String[] args) {
        
        int a[] = {4, 1, 7, 4, 3, 7};
        
        HashSet <Integer> set = new LinkedHashSet<>();

        for(int i= 0; i<= a.length-1; i++){
            if(!set.add(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
    
}
