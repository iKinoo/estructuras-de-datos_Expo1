package com.expo1.DequeError;

// import ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        // create an object for the Deque class
        ArrayDeque<Integer> cad = new ArrayDeque<Integer>();

        /* Adding integers to the deque at rear */
        cad.enqueueRear(40);
        cad.dequeueRear();
        cad.enqueueFront(-4);
        cad.dequeueFront();

        System.out.println(cad.first());
        System.out.println(cad.last());
    }
}
