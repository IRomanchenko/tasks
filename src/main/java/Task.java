import java.util.*;
import java.util.stream.Collectors;

public class Task {

    public List<Integer> largestTriangle(List<Integer> arr) {

        List<Integer> sorted = arr.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < sorted.size() - 2; i++) {
            Integer a = sorted.get(i);
            Integer b = sorted.get(i + 1);
            Integer c = sorted.get(i + 2);
            if (a < b + c) {
                return Arrays.asList(a, b, c);
            }
        }

        throw new IllegalArgumentException("The list has no possible triangles");
    }

//    [1, 34, 4, 5, 3, 10, 100, 1]
//      a + b > c, a + c > b, b + c > a 
//    Perimeter = a + b + c  
//    3, 4, 5 -> 12

}
