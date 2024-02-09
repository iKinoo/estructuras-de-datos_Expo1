package com.expo1.DequeError;

public class ArrayDeque<T> implements DequeADT<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int front, rear, count;
    private T[] deque;

    //creates an empty deque using default capacity
    public ArrayDeque() {
        front = rear = count = 0;
        deque = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    //creates an empty deque using specified capacity
    public ArrayDeque (int initialCapacity) {
        front = rear = count = 0;
        deque = (T[])(new Object[initialCapacity]);
    }



    //adds an element to the rear of the deque
    public void enqueueRear(T element) {
        if(size() == deque.length) {
            System.out.println("The deque is full.");
            return;
        }

        deque[rear] = element;
        rear = (rear + 1)%deque.length;

        count++;

    }

    //adds an element to the front of the deque 
    public void enqueueFront(T element) {
        if(size() == deque.length) {
            System.out.println("The deque is full.");
            return;
        }

        if  (front == 0)
            front = deque.length - 1;
        else 
            front = (front -1)% deque.length;

        deque[front] = element;

        count++;

    }

    /*removes an element at the front of the deque and returns
     * a reference to it*/
    public T dequeueFront() throws EmptyCollectionException 
    {
            if (isEmpty())
                throw new EmptyCollectionException("deque");

            T result = deque[front];
            deque[front] = null;
            front = (front + 1)%deque.length;

            count--;
            return result;
    }



    /*removes an element at the rear of the deque and returns
     * a reference to it*/
    public T dequeueRear() throws EmptyCollectionException  {
        if (isEmpty())
            throw new EmptyCollectionException("deque");

        T result = deque[rear -1];
        deque[rear -1] = null;
        rear = (rear -1)% deque.length;
        count--;
        return result;
    }

    //returns an element at the front of the deque
    public T first() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("queue");
        T result = deque[front];
        return result;
    }

    //returns the element the deque rear
    public T last() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("queue");
        T result = deque[rear -1];
        return result;
    }

    //returns true if deque is empty
    public boolean isEmpty() {
        return (count==0);
    }

    //returns the number of elements in the deque
    public int size() {
        return count;
    }

    //returns a string representation of the deque
    public String toString() {
        String queueElements = "";

        for(int i=front, j=0;j<count;i=(i+1)%deque.length, j++) {
            queueElements = queueElements + deque[i].toString() + " ";
        }
        return queueElements;
    }

   

}
