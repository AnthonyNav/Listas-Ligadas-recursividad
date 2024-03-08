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
