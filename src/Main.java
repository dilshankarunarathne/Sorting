import me.karunarathne.Sorting.*;

public class Main {
    public static void main(String[] args) {
        Integer [] numbers = {17, 79, 47, 12, 97, 65, 28, 47} ;

//        InsertionSort.sort (numbers) ;
//        SelectionSort.sort (numbers) ;
//        BubbleSort.sort (numbers) ;
        MergeSort.sort (numbers) ;
//        QuickSort.sort (numbers) ;

        for (int i: numbers) System.out.print(i + " ");
    }
}
