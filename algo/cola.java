/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo;

/**
 *
 * @author LENOVO
 */
public class cola {

   
    private Nodo ultimo;
private Nodo primero;
private int cant;


public cola() {
    this.ultimo = null;
    this.primero = null;
    this.cant = 0;
    
    
    
    
}

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

public void agregar(int dato) {
    Nodo nuevo = new Nodo(dato, null);
    if (cant == 0) {
        primero = nuevo;
        ultimo = nuevo;
    }else
    {
        ultimo.setSiguiente(nuevo); 
        // Del ultimo nodo, asignas el puntero al nuevo nodo
        // Despues actualizas tu variable ultimo
        ultimo = nuevo;
    }
    cant = cant + 1;
}


public void quitar() {
    Nodo aux;
    aux = primero.getSiguiente();
    primero = null;
    primero = aux;
    cant = cant - 1;

}
}
