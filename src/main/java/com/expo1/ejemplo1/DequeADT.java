package com.expo1.ejemplo1;

public interface DequeADT<T> {

    public void enqueueRear(T element);
    public void enqueueFront(T element);
    public T dequeueFront() throws EmptyCollectionException;
    public T dequeueRear() throws EmptyCollectionException;
    public T first() throws EmptyCollectionException;
    public T last() throws EmptyCollectionException;
    public boolean isEmpty();
    public int size();

}
