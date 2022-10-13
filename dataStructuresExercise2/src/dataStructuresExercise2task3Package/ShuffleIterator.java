package dataStructuresExercise2task3Package;

import java.util.Iterator;

public class ShuffleIterator<T> implements Iterator<T> {
    private Iterator<T> iterator1;
    private Iterator<T> iterator2;
    private int counter = 0;
    private T ElemNext = null;
    private boolean bHasNext = true;

    public ShuffleIterator(Iterator<T> iterator1, Iterator<T> iterator2) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
        findNext();
    }

    private void findNext() {
        if(iterator1.hasNext() == false && iterator2.hasNext() == false) 
        {
            bHasNext = false;
            return;
        }

        if(counter == 0) 
        {
            if(iterator1.hasNext()) 
            {
                ElemNext = iterator1.next();
                counter = 1;
                return;
            } 
            else 
            {
                counter = 1;
                if(!iterator2.hasNext()) 
                {
                    ElemNext = iterator2.next();
                    return;
                }
            }
        }

        if (counter == 1) 
        {
            if (iterator2.hasNext()) 
            {
                ElemNext = iterator2.next();
                counter = 0;
                return;
            } 
            else 
            {
                counter = 0;
                if (iterator1.hasNext()) 
                {
                    ElemNext = iterator1.next();
                    return;
                }
            }

        }
    }

    @Override
    public boolean hasNext() {

        return bHasNext;
    }

    @Override
    public T next() {
        T nextValue = ElemNext;
        findNext();
        return nextValue;

    }

}
