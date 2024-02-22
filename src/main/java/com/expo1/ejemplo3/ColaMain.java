/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.expo1.ejemplo3;

/**
 *
 * @author LENOVO
 */
public class ColaMain {
    public static void main(String[] args) {
    cola cola1= new cola();
    cola1.agregar(10);
    cola1.agregar(5);
    cola1.agregar(15);
    cola1.agregar(25);
    cola1.agregar(35);
    cola1.quitar();
    cola1.agregar(10);
    cola1.quitar();
    System.out.println("Primero: "+cola1.getPrimero().getDato()+ " Ultimo: "+cola1.getUltimo().getDato()+" Cantidad de elementos: "+cola1.getCant());
}
    
}
