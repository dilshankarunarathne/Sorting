package me.karunarathne.Sorting;

public class BubbleSort {
    public static void sort (Comparable [] a) {
        int N = a.length ;
        int temp = 0 ;
        for (int i=0; i<N; i++) {
            for (int j=1; j<N-i; j++) {
                if (a[j-1] > a[j]) {
                    temp = a [j-1] ;
                    a[j-1] = a[j] ;
                    a[j] = temp ;
                }
            }
        }
    }
}
