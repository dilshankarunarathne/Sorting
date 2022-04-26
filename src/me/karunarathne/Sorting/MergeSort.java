package me.karunarathne.Sorting;

public class MergeSort {
    public static void merge (Comparable [] a, Comparable [] aux, int lo, int mid, int hi) {
//        precondition: a[lo..mid]         sorted
//        assert isSorted (a, lo, mid) ;

//        precondition: a[mid+1..hi]       sorted
//        assert isSorted (a, mid+1, hi) ;

        for (int k=lo; k<=hi; k++) aux [k] = a [k] ;

        int i = lo ;
        int j = mid+1 ;

        for (int k=lo; k<hi; k++) {
            if (i>mid) a [k] = aux [j++] ;
            else if (j>hi) a [k] = aux [i++] ;
            else if (isLess(aux[j], aux[i])) a [k] = aux [j++] ;
            else a [k] = aux [i++] ;
        }

//        post-condition: a[lo..hi]        sorted
//        assert isSorted (a, lo, hi) ;
    }

    private static boolean isLess (Comparable v,  Comparable w) {
        return v.compareTo(w) < 0 ;
    }
}
