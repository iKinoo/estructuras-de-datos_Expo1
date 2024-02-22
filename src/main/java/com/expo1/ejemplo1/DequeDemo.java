package com.expo1.ejemplo1;

// import ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        // create an object for the Deque class
        ArrayDeque<Integer> cad = new ArrayDeque<Integer>();

        /* Adding integers to the deque at rear */
        cad.enqueueRear(40);
        cad.enqueueRear(17);
        cad.enqueueRear(-1);
        // cad.dequeueRear();
        cad.enqueueFront(-4);
        cad.enqueueFront(10);
        cad.enqueueFront(20);
        cad.enqueueFront(60);
        cad.enqueueFront(90);
        cad.enqueueFront(23);
        cad.enqueueFront(5);
        cad.enqueueFront(7);

        cad.dequeueFront();
        cad.dequeueRear();
        // cad.dequeueFront();

        System.out.println(cad.first());
        System.out.println(cad.last());
    }
}
