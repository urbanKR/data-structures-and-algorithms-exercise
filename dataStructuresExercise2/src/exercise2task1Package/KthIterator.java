package exercise2task1Package;

import java.util.Iterator;

public final class KthIterator<T> implements Iterator<T> {
    private Iterator<T> iterator;
    private int counter = 0;
    private int k;
    private T elemNext = null;
    private boolean bHasNext = true;

    public KthIterator(Iterator<T> iterator, int k) {
        super();
        this.iterator = iterator;
        this.k = k;
        findNextValid();
    }

    private void findNextValid() {
        while(iterator.hasNext()) {
            elemNext = iterator.next();
            if(counter == k - 1)
            {

                counter = 0;
                return;
            }
            counter++;
        }
        elemNext = null;
        bHasNext = false;
    }

    @Override
    public boolean hasNext() {

        return bHasNext;
    }

    @Override
    public T next() {
        T nextValue = elemNext;
        findNextValid();
        return nextValue;
    }
}
