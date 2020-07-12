package sorting;

import java.util.Arrays;

/**
 * O(n^2) average case
 * In every step, compares two adjacent elements, if lower is on the lef side of higher, swaps them. Moves on with the array.
 */
public class BubbleSort {

    public static void sort(){
        System.out.println("BubbleSort");

        int[] array = {2,4,5,1,0,2,7,6};
        System.out.println("before sort:" + Arrays.toString(array) );
        bubbleSort(array);
        System.out.println("after sort:" + Arrays.toString(array));
    }
    /**
     * Bubble sort (descending order)
     * @param array array to besorted
     */
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j+1]){
                    swap(array, j, j+1);
                }
            }
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
