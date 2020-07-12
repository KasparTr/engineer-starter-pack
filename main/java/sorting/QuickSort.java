package sorting;


import java.util.Arrays;

/**
 * O(nlog(n)) average case
 * O(n^2) worst case
 * In-place algorithm
 */
public class QuickSort {

    public static void sort(){
        System.out.println("QuickSort");

        int[] array = {7,6,5,4,3,2,1,0};
        System.out.println("before sort:" + Arrays.toString(array) );
        quickSort(array, 0, array.length-1);
        System.out.println("after sort:" + Arrays.toString(array));

    }


    private static void quickSort(int[] array, int start, int end){
        if(start < end){
            int partIndex = partition(array, start, end);

            // recursive, ignore the partIndex
            quickSort(array, start, partIndex - 1);
            quickSort(array, partIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end){
        int pivot = array[end];        // choose the pivot (take from end or randomly for efficient implementation)
        int pIndex = start;

        for(int i = start; i<end; i++){
            if(array[i] <= pivot){ // if lesser than pivot, swap with partition index (pIndex)
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        // swap element in partition index w/ element in end index.
        swap(array, pIndex, end);
        return pIndex;
    }


    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }

}
