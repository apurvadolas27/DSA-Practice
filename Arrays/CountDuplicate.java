
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountDuplicate {
    public static void main(String[] args) {
        
        int a[] = {4, 1, 7, 4, 3, 7};
        int count = 0;
        
        HashSet <Integer> set = new LinkedHashSet<>();

        for(int i= 0; i<= a.length-1; i++){
            if(!set.add(a[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
