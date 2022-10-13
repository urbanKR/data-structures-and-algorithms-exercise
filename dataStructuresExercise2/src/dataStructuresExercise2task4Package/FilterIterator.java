package dataStructuresExercise2task4Package;

import java.util.Iterator;


public final class FilterIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Predicate<Integer> predicate;
    private Integer elemNext = null;
    private boolean bHasNext = true;

    public FilterIterator(Iterator<Integer> iterator, Predicate<Integer> predicate) {
        super();
        this.iterator = iterator;
        this.predicate = predicate;
        findNextValid();
    }

    private void findNextValid() {
        while(iterator.hasNext()) {
            elemNext = iterator.next();
            if(predicate.accept(elemNext)) {
                return;
            }
        }
        bHasNext = false;
        elemNext = null;

    }

    @Override
    public boolean hasNext() {
        return bHasNext;
    }

    @Override
    public Integer next() {
        Integer nextValue = elemNext;
        findNextValid();
        return nextValue;
    }

}
