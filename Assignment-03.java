import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int[] zigzag = getZigzag(sequence);
        System.out.println(Arrays.toString(zigzag)); // prints [5, 1, 4, 2, 3]
    }
    
    public static int[] getZigzag(int[] sequence) {
        Arrays.sort(sequence); // sort the sequence in ascending order
        int n = sequence.length;
        int[] zigzag = new int[n];
        int i = 0, j = n-1, k = 0;
        while (i <= j) {
            zigzag[k++] = sequence[j--]; // add the largest number to the zigzag
            if (i < j) {
                zigzag[k++] = sequence[i++]; // add the smallest number to the zigzag
            }
        }
        return zigzag;
    }
}
