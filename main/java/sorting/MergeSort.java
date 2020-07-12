package sorting;

import java.util.Arrays;

/**
 * O(nlog(n)) worst case!
 * Not-in-place algorithm
 */
public class MergeSort {
    public static void sort(){
        System.out.println("MergeSort");

        int[] array = {2,4,5,1,0,2,7,6};
        System.out.println("before sort:" + Arrays.toString(array) );
        int[] aux = new int[array.length];
        mergeSort(array, aux, 0,array.length-1);
        System.out.println("after sort:" + Arrays.toString(array));
    }

    /**
     * Merge sort (descending order)
     * @param array array to be sorted
     * @param aux auxiliary array of the same size as array
     * @param left first index, which can be touched
     * @param right last index, which can be touched
     */
    public static void mergeSort(int[] array, int[] aux, int left, int right) {
        if (left == right) return;  // single element array, is sorted
        int middleIndex = (left + right)/2;
        mergeSort(array, aux, left, middleIndex);
        mergeSort(array, aux, middleIndex + 1, right);
        merge(array, aux, left, right);

        for (int i = left; i <= right; i++) {
            array[i] = aux[i];
        }
    }

    /**
     * Merge procedure for merge sort
     * @param array array to be merged
     * @param aux auxiliary array to which merger will happen (same size as array)
     * @param left first index, which can be touched
     * @param right last index, which can be touched
     */
    private static void merge(int[] array, int[] aux, int left, int right) {
        int middleIndex = (left + right)/2;
        int leftIndex = left;
        int rightIndex = middleIndex + 1;
        int auxIndex = left;
        while (leftIndex <= middleIndex && rightIndex <= right) {
            if (array[leftIndex] >= array[rightIndex]) {
                // left array element has priority
                aux[auxIndex] = array[leftIndex];
                leftIndex++;
            } else {
                // right array element has priority
                aux[auxIndex] = array[rightIndex];
                rightIndex++;
            }
            auxIndex++;
        }
        // left or right array has exhousted

        // finish with left array
        while (leftIndex <= middleIndex) {
            aux[auxIndex] = array[leftIndex];
            leftIndex++;
            auxIndex++;
        }
        // finish with right array
        while (rightIndex <= right) {
            aux[auxIndex] = array[rightIndex];
            rightIndex++;
            auxIndex++;
        }
    }
}
