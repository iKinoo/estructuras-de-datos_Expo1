package com.expo1.ejemplo1.ejemploDequeError;

import com.expo1.ejemplo1.ArrayDeque;
import com.expo1.ejemplo1.EmptyCollectionException;

public class EjemploDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        // create an object for the Deque class
        ArrayDeque<Integer> cad = new ArrayDeque<Integer>();

        /* Adding integers to the deque at rear */
        cad.enqueueRear(40);
        cad.enqueueRear(18);
        cad.enqueueRear(-2);
        // cad.dequeueRear();
        cad.enqueueFront(-4);
        cad.enqueueFront(28);
        // cad.dequeueFront();

        System.out.println(cad.first());
        System.out.println(cad.last());
    }
    
}
