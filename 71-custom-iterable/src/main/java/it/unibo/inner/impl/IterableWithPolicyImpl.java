package it.unibo.inner.impl;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public final class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private final List<T> array;

    public IterableWithPolicyImpl(final T[] array) {
        this.array = List.of(array);
    }

    public Iterator<T> iterator() {
        return new InnerIterator();
    }

    @Override
    public void setIterationPolicy(Predicate<T> filter) {

    }

    private class InnerIterator implements Iterator<T> {

        private Integer current = 0;

        @Override
        public T next() {
            //controllare con un idncie se esiste la lsita e quanti elementi 
            if (hasNext()) {
                return array.get(current++);
            }
            throw new NoSuchElementException();
        }

        //indicare se rispetta i limiti della lista
        @Override
        public boolean hasNext() {
            if (current < array.size()) {
                return true;
            }
            return false;
        }
    }
}
