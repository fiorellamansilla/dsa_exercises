package Arrays;

import java.util.Arrays;
import java.util.Random;

public class SortingArray {

    public static void main(String[] args) {

        int[] unsortedArray = createRandomArray(5);
        int[] testArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(testArray));

        descendingBubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }


    // Method for sorting elements from the array in descending order
    private static void descendingBubbleSort (int[] array) {

        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    // Method for swapping two elements inside an array
    private static void swap(int[]array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Method that creates an array of randomly generated integers
    private static int[] createRandomArray(int len) {

        Random random = new Random();
        int [] integerArray = new int[len];

        for (int i = 0; i < len; i++) {
            integerArray[i] = random.nextInt(100);
        }
        return integerArray;
    }
}
