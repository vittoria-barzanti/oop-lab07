package it.unibo.inner.api;

import java.util.ArrayList;
import java.util.Iterator;

public final class ImplementIterableWithPolicy<T> implements IterableWithPolicy<T> {

    private class InnerIterator implements Iterator<T> {

        private Integer current;

        public InnerIterator(final Integer start) {
            this.current = start;
        }

        @Override
        public T next() {
            //controllare con un idncie se esiste la lsita e quanti elementi 
        }

        //indicare se rispetta i limiti della lista
        @Override
        public boolean hasNext() {
            return this.current;
        }
    }

    private ArrayList<T> array = new ArrayList<>();
    private InnerIterator iterator;

    public ImplementIterableWithPolicy(ArrayList array) {
        this.array = array;
        this.iterator = new InnerIterator(0, (array.size() - 1));

    }

    public Iterator iterator() {
        return this.iterator;
    }

    public void setIterationPolicy(Predicate<T> filter) {

    }
}
