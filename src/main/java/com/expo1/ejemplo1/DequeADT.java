package com.expo1.ejemplo1;

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
