package com.expo1.DequeError;

public interface DequeADT<T> {
// no la presenta en el código original
    public void enqueueRear(T element);
// no la presenta en el código original
    public void enqueueFront(T element);
// no la presenta en el código original
    public T dequeueRear() throws EmptyCollectionException;
// no la presenta en el código original
    public T dequeueFront() throws EmptyCollectionException;

}
