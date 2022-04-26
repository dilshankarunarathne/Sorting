import me.karunarathne.Sorting.InsertionSort;
import me.karunarathne.Sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {
        Integer [] numbers = {17, 79, 47, 12, 97, 65, 28, 47} ;
        SelectionSort.sort(numbers);
        for (int i: numbers) System.out.println(i);
    }
}
