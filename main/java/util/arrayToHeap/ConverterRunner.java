package util.arrayToHeap;

import java.util.Scanner;

public class ConverterRunner {
    public static void main(String args[])
    {
        Converter converter = new Converter();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array: ");
        for(int i=0;i<n;i++)
            arr[i] =sc.nextInt();
        converter.buildHeap(arr, n);
        converter.printHeap(arr, n);
    }
}
