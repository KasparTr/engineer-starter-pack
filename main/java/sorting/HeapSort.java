package sorting;
import java.util.Arrays;

/**
 * O(nlog(n)) guaranteed!
 * LET THE BINARY HEAP DATA-STRUCTURE DO THE SORTING FOR YOU!
 * Fitting to use in real time systems instead of quicksort as its worst case can be O(n^2).
 * Uses binary heap data structure which acts as a priority queue.
 * If we insert all elements of the array into the priority queue, the operation poll will always return (and remove) the element of the head which has the higher priority.
 * Using poll operation n times, will obtain sorted element
 */
public class HeapSort {

    public static void sort(){
        System.out.println("HeapSort");

        Comparable[] list = new Comparable[8];
        list[0] = Integer.valueOf(3);
        list[1] = Integer.valueOf(2);
        list[2] = Integer.valueOf(1);
        list[3] = Integer.valueOf(0);
        list[4] = Integer.valueOf(7);
        list[5] = Integer.valueOf(5);
        list[6] = Integer.valueOf(6);
        list[7] = Integer.valueOf(4);

        System.out.println("before sort:" + Arrays.toString(list) );
        heapSort(list, true);
        System.out.println("after sort:" + Arrays.toString(list));
    }
    /**
     * Heapsort
     * @param array array to be sorted
     * @param descending false if the array should be sorted in ascending order, true for a descending order
     */
    public static void heapSort(Comparable[] array, boolean descending) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            repairTop(array, array.length - 1, i, descending ? 1 : -1);
        }
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            repairTop(array, i - 1, 0, descending ? 1 : -1);
        }
    }

    /**
     * Move the top of the heap to the correct place
     * @param array array to be sorted
     * @param bottom last index that can be touched
     * @param topIndex index of the top of the heap
     * @param order 1 == descending order, -1 ascending order
     */
    private static void repairTop(Comparable[] array, int bottom, int topIndex, int order) {
        Comparable tmp = array[topIndex];
        int succ = topIndex * 2 + 1;
        if (succ < bottom && array[succ].compareTo(array[succ + 1]) == order) {
            succ++;
        }

        while (succ <= bottom && tmp.compareTo(array[succ]) == order) {
            array[topIndex] = array[succ];
            topIndex = succ;
            succ = succ * 2 + 1;
            if (succ < bottom && array[succ].compareTo(array[succ + 1]) == order) {
                succ++;
            }
        }
        array[topIndex] = tmp;
    }

    /**
     * Swaps two elements of the heap
     * @param array array
     * @param left index of the first element
     * @param right index of the second element
     */
    private static void swap(Comparable[] array, int left, int right) {
        Comparable tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }
}
