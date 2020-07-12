package sorting;

import java.util.Arrays;

/**
 * Select first unsorted element
 * Swap other elements to the right to create the correct position and shift the unsorted element
 */
public class InsertionSort {

    public static void sort(){
        System.out.println("InsertionSort");

        int[] array = {2,4,5,1,0,2,7,6};
        System.out.println("before sort:" + Arrays.toString(array) );
        insertionSort(array);
        System.out.println("after sort:" + Arrays.toString(array));
    }

    /**
     * Insertion sort (descending order)
     * @param array array to be sorted
     */
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int tmp = array[j];
            while (j > 0 && tmp > array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = tmp;
        }
    }
}
