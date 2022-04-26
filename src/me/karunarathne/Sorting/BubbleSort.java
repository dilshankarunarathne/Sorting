package me.karunarathne.Sorting;

public class BubbleSort {
    public static void sort (Comparable [] a) {
        int N = a.length ;
        Comparable temp = 0 ;
        for (int i=0; i<N; i++) {
            for (int j=1; j<N-i; j++) {
                if (isLess(a[j], a[j-1])) {
                    temp = a [j-1] ;
                    a[j-1] = a[j] ;
                    a[j] = temp ;
                }
            }
        }
    }

    private static boolean isLess (Comparable v,  Comparable w) {
        return v.compareTo(w) < 0 ;
    }
}
