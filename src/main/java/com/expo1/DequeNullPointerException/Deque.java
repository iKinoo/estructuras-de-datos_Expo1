package com.expo1.DequeNullPointerException;

import java.util.*;

public class Deque<Item> implements Iterable<Item> {
    private Node sentinel;

    private class Node {
        Item item;
        Node next;
        Node previous;
        Node(Item value) {
            item = value;
            next = this;
            previous = this;
        }
    }

    public Deque(Item item)                           // construct an empty deque
    {
        Node sentinel = new Node(item);
    }

    public boolean isEmpty()                 // is the deque empty?
    {
        return (size() == 0);
    }
    public int size()                        // return the number of items on the deque
    {
        System.out.println("size");
        if (sentinel.next == sentinel) {
            System.out.println("empty");}
        return 0;

//        }
//        int count = 0;
//        Node temp = sentinel;
//        while (temp != sentinel)
//        {
//            count += 1;
//            temp = temp.next;
//        }
//        return count;
    }
    public void addFirst(Item item)          // insert the item at the front
    {
        if (item == null) {
            throw new java.util.NoSuchElementException();
        }
        Node a = new Node(item);
        if (isEmpty())
        {
            System.out.println("Hello world");
            sentinel.next = a;
            a.previous = sentinel;
        }
        else
        {
            sentinel.next.previous = a;
            sentinel.next = a;
            a.previous = sentinel;
        }
    }
    public void addLast(Item item)           // insert the item at the end
    {
        if (item == null)
            throw new java.util.NoSuchElementException();
        Node a = new Node(item);
        sentinel.previous = a;
        a.next = sentinel;
    }
    public Item removeFirst()                // delete and return the item at the front
    {
        if (isEmpty())
            throw new UnsupportedOperationException();
        Item value = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.previous = sentinel;
        return value;
    }
    public Item removeLast()                 // delete and return the item at the end
    {
        if (isEmpty())
            throw new UnsupportedOperationException();
        Item value = sentinel.previous.item;
        sentinel.previous = sentinel.previous.previous;
        sentinel.previous.next = sentinel;
        return value;
    }
    public Iterator<Item> iterator()         // return an iterator over items in order from front to end
    {
        return new DequeueIterator();
    }

    private class DequeueIterator implements Iterator<Item>
    {
        private Node current = sentinel;
        public boolean hasNext() {
            return current != null;
        }
        public void remove() {}
        public Item next() {
            Item value = current.item;
            current = current.next;
            return value;
        }

    }
    public static void main(String[] args)   // unit testing
    {
        System.out.println(Thread.currentThread().getStackTrace());
        Deque<Integer> d = new Deque<Integer>(0);
        System.out.println(d.isEmpty());
                System.out.println(Thread.currentThread().getStackTrace());
//        d.addFirst(10);

//        System.out.println(d.size());
        // System.out.println(d.removeLast());
    }
}