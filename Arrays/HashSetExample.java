import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> Set = new LinkedHashSet<>();

        Set.add(5);
        Set.add(1);
        Set.add(4);
        Set.add(3);
        Set.add(9);
        Set.add(0);
        System.out.println(Set);

    }
}
