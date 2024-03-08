package com.simple;

public class ListaLSimple {
    private Nodo inicio;

    // constructor
    public ListaLSimple() {
        inicio = null;
    }
    // getters y setters
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    // Metodo para insertar valores

    public void insertar(int dato){
        if (this.estaVacia()) {
            this.inicio = new Nodo(dato);
        } else {
            Nodo auxNodo = this.inicio;
            while (auxNodo.getNext() != null) { // Recorre la lista
                auxNodo = auxNodo.getNext();
            }
            auxNodo.setNext(new Nodo(dato)); // Inserta la referencia al nuevo nodo
        }
    }

    // Metodos indicados
    

    // toString que retorna el contenido de la lista
    @Override
    public String toString(){ // Asume que no esta vacia la lista
        String output = "";
        Nodo auxNodo = this.inicio;
        if (!estaVacia()) {
            while (auxNodo.getNext() != null) { // Recorre la lista
                output = output + " " + auxNodo.getDato(); // concatena
                auxNodo = auxNodo.getNext();
            }
            output = output + " " + auxNodo.getDato(); // concatena el ultimo nodo
        }
        return output; // Retorna nuestra cadena que representa los elementos existentes
    }

    public boolean estaVacia(){
        return inicio==null;
    }


    
    
}
