import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {
        Integer[] array = {14, 67, 48, 23, 5, 62};
        int N = 4;

        int nthLargest = findNthLargestNumber(array, N);

        System.out.println(N + "th Largest number: " + nthLargest);
    }

    public static int findNthLargestNumber(Integer[] array, int N) {
 
        Arrays.sort(array, Collections.reverseOrder());

        return array[N - 1];
    }
}