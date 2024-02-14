package yandex.taskTwo;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MultiIterators <T> implements Iterator <T> {
    private final Iterator<T>[] arrayIfIterator;
    private int iteratorIndex = 0;

    public MultiIterators(Iterator<T>[] arrayIfIterator) {
        this.arrayIfIterator = arrayIfIterator;
    }

    @Override
    public boolean hasNext() {
        for (int i = iteratorIndex; i < arrayIfIterator.length; i++) {
            if (arrayIfIterator[i].hasNext()) {
                iteratorIndex = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public T next() {
        if (hasNext())
            return arrayIfIterator[iteratorIndex].next();
        else
            throw new NoSuchElementException("No element");

    }

    @Override
    public void remove() {
        if (hasNext())
            arrayIfIterator[iteratorIndex].remove();
        else
            throw new NoSuchElementException("No element");
    }
}