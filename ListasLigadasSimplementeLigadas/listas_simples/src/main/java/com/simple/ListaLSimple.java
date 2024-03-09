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

    // Sumar todos los elementos de forma recursiva
    public int sumarTodos(Nodo n){
        if (n != null) { // Verifica que no sea null
            return n.getDato() + sumarTodos(n.getNext()); // Suma el valor y llama de nuevo a la funcion
        }
        return 0; // Si el nodo es null, entonces retornará 0
    }

    public int sumarPares(Nodo n){
        if (n != null) { // Verifica que no sea null
            if ((n.getDato() % 2) == 0) { // Suma el dato con la siguiente invocacion del metodo
                return n.getDato() + sumarPares(n.getNext()); 
            }
            return sumarPares(n.getNext()); // Si no es par, entonces solo invoca de nuevo al metodo
        }
        return 0; // Si es null, retorna 0
    }

    public String verPares(Nodo n){
        if (n != null) { // Verifica que no sea null
            if ((n.getDato() % 2) == 0) { // Si es par
                return " " + n.getDato() + verPares(n.getNext()); // Concatena nuestro elemento junto a la siguiente invocacion
            }
            return verPares(n.getNext()); // Sino simplemente llama de nuevo a la funcion
        }
        return ""; // Si es null solo retorna una cadena vacia
    }

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
