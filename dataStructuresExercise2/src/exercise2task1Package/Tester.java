package exercise2task1Package;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> arrL = Arrays.asList(arr);
        Iterator<Integer> iter = arrL.iterator();

        KthIterator<Integer> kthIter = new KthIterator<Integer>(iter,3);
        while(kthIter.hasNext()) {
            System.out.println(kthIter.next());
        }

    }

}
