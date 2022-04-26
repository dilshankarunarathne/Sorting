package me.karunarathne.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void sort (Comparable [] a) {
        shuffle (a) ;
        sort (a, 0, a.length-1) ;
    }

    private static void sort (Comparable [] a, int lo, int hi) {
        if (hi <= lo) return ;
        int j = partition (a, lo, hi) ;
        sort (a, lo, j-1) ;
        sort (a, j+1, hi) ;
    }

    private static boolean isLess (Comparable v,  Comparable w) {
        return v.compareTo(w) < 0 ;
    }

    private static int partition (Comparable [] a, int lo, int hi) {
        int i = lo ;
        int j = hi+1 ;
        while (true) {
            while (isLess (a[++i], a[lo])) if (i==hi) break ;
            while (isLess (a[lo], a[--j])) if (j==lo) break ;

            if (i >= j) break ;
            swap (a, i, j) ;
        }

        swap (a, lo, j) ;
        return j ;
    }

    private static void swap (Comparable [] a, int i, int j) {
        Comparable temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
    }

    private static void shuffle (Comparable [] a) {
        List<Comparable> list = Arrays.asList(a);
        Collections.shuffle(list);
        list.toArray(a);
    }
}
