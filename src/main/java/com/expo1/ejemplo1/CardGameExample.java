package com.expo1.ejemplo1;

public class CardGameExample {
    

        public static void main(String[] args) {
            ArrayDeque<String> deck = new ArrayDeque<>();
    
            // Inicializamos la baraja con algunas cartas
            deck.enqueueRear("Carta3");
            deck.enqueueRear("Carta2");
            deck.enqueueRear("Carta1");
    
            System.out.println("Baraja inicial: " + deck);
    
            // Jugador 1 roba una carta al principio y juega una al final
            deck.enqueueFront("CartaExtra1");
            System.out.println("Jugador 1 roba al principio y juega al final: " + deck);
    
            // Jugador 2 roba una carta al final y juega una al principio
            deck.enqueueRear("CartaExtra2");
            System.out.println("Jugador 2 roba al final y juega al principio: " + deck);
    
            // Jugador 1 roba otra carta al principio
            deck.enqueueFront("CartaExtra3");
            System.out.println("Jugador 1 roba al principio nuevamente: " + deck);
    
            // Jugador 2 juega una carta al final
            deck.enqueueRear("CartaExtra4");
            System.out.println("Jugador 2 juega al final: " + deck);
    
            // Imprimimos el estado final de la baraja
            System.out.println("Baraja final: " + deck);
        }
    }
