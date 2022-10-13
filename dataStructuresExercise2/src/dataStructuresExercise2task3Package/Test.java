package dataStructuresExercise2task3Package;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        List<Integer> arrL1 = Arrays.asList(arr1);
        Iterator<Integer> iter1 = arrL1.iterator();
        Integer[] arr2 = {1,2,3,4};
        List<Integer> arrL2 = Arrays.asList(arr2);
        Iterator<Integer> iter2 = arrL2.iterator();
        ShuffleIterator<Integer> sIter = new ShuffleIterator<Integer> (iter1,iter2);
        while(sIter.hasNext()) {
            System.out.println(sIter.next());
        }
    }
}
