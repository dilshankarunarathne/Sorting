package me.karunarathne.Sorting;

public class BubbleSort {
    public static void sort (Comparable [] a) {
        int N = a.length ;
        for (int i=0; i<N; i++) {
            for (int j=1; j<N-i; j++) {
                if (isLess(a[j], a[j-1])) swap (a, j, j-1) ;
            }
        }
    }

    private static boolean isLess (Comparable v,  Comparable w) {
        return v.compareTo(w) < 0 ;
    }

    private static void swap (Comparable [] a, int i, int j) {
        Comparable temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
    }
}
