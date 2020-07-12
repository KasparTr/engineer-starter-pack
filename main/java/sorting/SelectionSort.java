package sorting;

import java.util.Arrays;

/**
 * O(n^2) average case
 * Iterates the array and finds the highest element and swaps it with the first element, then moves on with the array
 */
public class SelectionSort {

    public static void sort(){
        System.out.println("SelectionSort");

        int[] array = {2,4,5,1,0,2,7,6};
        System.out.println("before sort:" + Arrays.toString(array) );
        selectionSort(array);
        System.out.println("after sort:" + Arrays.toString(array));
    }

    /**
     * Selection sort (descending order)
     * @param array array to be sorted
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) maxIndex = j;
            }
            swap(array, maxIndex, i);
        }
    }

    /**
     *	Swap left and right element in an array
     **/
    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }
}
