import java.util.Arrays;

public class OneDimensionalArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {1,2,3};
        int[] arr3;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        arr3 = new int[]{1, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array Index: " + i + " | Value: " + arr[i]);
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

}
