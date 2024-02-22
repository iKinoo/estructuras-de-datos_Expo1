package com.expo1.ejemplo1;

// import java.util.ArrayDeque;

public class DequeDemo {

    public static void main(String[] args) throws EmptyCollectionException {
        //create an object for the Deque class
        ArrayDeque<Integer> cad = new ArrayDeque<Integer>();

        /*Adding integers to the deque at rear*/
        cad.enqueueRear(17);
        cad.enqueueRear(25);
        cad.enqueueRear(99);
        cad.enqueueFront(40);
        cad.enqueueFront(39);
        cad.enqueueFront(20);
        // System.out.println(cad);
        // System.out.println("----");
        // cad.dequeueRear();
        // System.out.println(cad);
        // System.out.println("----");
        // cad.enqueueFront(-4);
        // System.out.println(cad);
        // System.out.println("----");
        // cad.dequeueFront();
        System.out.println(cad);
        System.out.println("----");
        
        
        System.out.println(cad.first());
        System.out.println(cad.last());
    }

}
