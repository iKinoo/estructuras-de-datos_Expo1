package com.expo1.DequeError.ejemploDequeError;

import com.expo1.DequeError.ArrayDeque;

import com.expo1.DequeError.EmptyCollectionException;

public class RestauranteDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        // Crear un deque para simular la cola de espera en el restaurante
        ArrayDeque<String> colaEspera = new ArrayDeque<>();

        // Llegada de clientes
        colaEspera.enqueueRear("Cliente1"); // Llega por la puerta trasera
        colaEspera.enqueueRear("Cliente2");
        colaEspera.enqueueRear("Cliente3");

        // Mostrar la cola de espera actual
        System.out.println("Cola de espera actual: " + colaEspera);

        // Llegada de nuevos clientes por la puerta principal
        colaEspera.enqueueFront("NuevoCliente1");
        colaEspera.enqueueFront("NuevoCliente2");

        // Mostrar la cola de espera actual después de las nuevas llegadas
        System.out.println("Cola de espera después de nuevas llegadas: " + colaEspera);

        // Algunos clientes son atendidos y salen
        colaEspera.dequeueFront(); // El primer cliente es atendido y sale por la puerta principal
        colaEspera.dequeueRear();  // El último cliente es atendido y sale por la puerta trasera

        // Mostrar la cola de espera actual después de las salidas
        System.out.println("Cola de espera después de algunas salidas: " + colaEspera);

        // Mostrar al siguiente cliente que será atendido (primero en la cola)
        System.out.println("Próximo cliente a ser atendido: " + colaEspera.getFirst());

        // Mostrar al último cliente que llegó (último en la cola)
        System.out.println("Último cliente que llegó: " + colaEspera.getLast());
    }
}

