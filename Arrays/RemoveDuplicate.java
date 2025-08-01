import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        int a[] = {4, 6, 1, 3, 6, 9, 1};

        HashSet<Integer> set = new LinkedHashSet <> ();

        for(int i = 0; i<= a.length-1; i++){
            set.add(a[i]);
        }

        int b[] = new int [set.size()];
        int j=0;
        
        for(int item : set){
            b[j]=item;
            j++;
        }

        System.out.println(Arrays.toString(b));
    }
}

