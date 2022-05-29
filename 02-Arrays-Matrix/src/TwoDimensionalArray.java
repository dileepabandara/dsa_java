import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b;

        b = new int[][]{{4, 5}, {1, 2, 3}};

        System.out.println("A[0]: " + Arrays.toString(a[0]));
        System.out.println("B[0]: " + Arrays.toString(b[0]));

        System.out.println("A[0][0]: " + a[0][0]);
        System.out.println("B[0][0]: " + b[0][0]);
    }

}
