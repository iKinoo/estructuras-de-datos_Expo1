package com.expo1.ejemplo2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private int size;

    private Node<Item> first;
    private Node<Item> last;

    @SuppressWarnings("hiding")
    private class Node<Item> {
        Item item;
        Node<Item> next;
        Node<Item> prev;

        Node(Item item) {
            this.item = item;
            next = null;
            prev = null;
        }
    }

    // construct an empty deque
    public Deque() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    } // is the deque empty?

    public int size() {
        return size;
    } // return the number of items on the deque

    @SuppressWarnings({ "unchecked", "rawtypes" })
    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new java.lang.NullPointerException();
        } else if (this.isEmpty()) {
            first = new Node(item);
            last = first; // Corregir este error, asigna last igual a first
        } else {
            Node oldfirst = first;
            first = new Node(item); // Corregir este error, elimina la declaración de Node first
            first.next = oldfirst;
            oldfirst.prev = first;
        }
        size++;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    // add the item to the end
    public void addLast(Item item) {
        if (item == null) {
            throw new java.lang.NullPointerException();
        } else if (this.isEmpty()) {
            last = new Node(item); // Asignar directamente a la variable de instancia last
            first = last; // Asegurarse de asignar también first si la lista estaba vacía
        } else {
            Node oldlast = last;
            last = new Node(item);
            oldlast.next = last;
            last.prev = oldlast;
        }
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (this.isEmpty()) {
            // linea erronea
            // throw java.util.NoSuchElementException();
            // linea correcta
            throw new java.util.NoSuchElementException();
        } else {
            Item item = first.item;
            first = first.next;
            first.prev = null;
            if (size == 1) {
                first = last;
            }
            size--;
            return item;
        }
    }

    // remove and return the item from the end
    public Item removeLast() {
        if (this.isEmpty()) {
            // linea erronea
            // throw java.util.NoSuchElementException();
            // linea correcta
            throw new java.util.NoSuchElementException();
        } else {
            Item item = last.item;
            last = last.prev;
            if (size == 1) {
                last = first;
            }
            size--;
            return item;
        }
    }

    // return an iterator over items in order from front to end

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    @SuppressWarnings("hiding")
    private class DequeIterator<Item> implements Iterator<Item> {
        @SuppressWarnings("rawtypes")
        private Node current;

        public DequeIterator() {
            this.current = first;
        }

        public boolean hasNext() {
            return current != null;
        };

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException();
            @SuppressWarnings("unchecked")
            Item item = (Item) current.item;
            current = current.next;
            return item;
        }

    }

    // unit testing (optional)
    public static void main(String[] args) {
        Deque<String> shoppingCart = new Deque<String>();

        // Agregar algunos productos al carrito
        shoppingCart.addLast("Producto 1");
        shoppingCart.addLast("Producto 2");
        shoppingCart.addFirst("Producto 3");
        shoppingCart.addFirst("Producto 4");
        shoppingCart.addLast("Producto 5");

        // Mostrar los productos en el carrito utilizando el iterador
        System.out.println("Productos en el carrito:");
        Iterator<String> iterator = shoppingCart.iterator();
        while (iterator.hasNext()) {
            String product = iterator.next();
            System.out.println(product);
        }

        // Mostrar el tamaño del carrito
        System.out.println("Tamaño del carrito: " + shoppingCart.size());

        // Eliminar un producto del principio del carrito
        String removedProduct = shoppingCart.removeFirst();
        System.out.println("Producto eliminado del principio del carrito: " + removedProduct);

        // Mostrar los productos en el carrito después de eliminar el primero
        System.out.println("Productos en el carrito después de eliminar el primero:");
        iterator = shoppingCart.iterator();
        while (iterator.hasNext()) {
            String product = iterator.next();
            System.out.println(product);
        }

        // Agregar un nuevo producto al final del carrito
        shoppingCart.addLast("Nuevo Producto");

        // Mostrar los productos en el carrito después de agregar uno nuevo
        System.out.println("Productos en el carrito después de agregar uno nuevo:");
        iterator = shoppingCart.iterator();
        while (iterator.hasNext()) {
            String product = iterator.next();
            System.out.println(product);
        }

    }

}