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

    public String mostrarPrimos(Nodo n) {
        String primos = "";
        if (n != null) {
            if (esPrimo(n.getDato())) {
                primos += n.getDato() + " "; // Agrega el número primo a la cadena
            }
            primos += mostrarPrimos(n.getNext()); // Llama recursivamente al siguiente nodo
        }
        return primos;
    }
    
    
    private boolean esPrimo(int num) {
        int i;
        if (num <= 1) {
            return false;
        }
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void eliminarDato(int dato) {
        inicio = eliminarDatoRecursivo(inicio, dato);
    }

    private Nodo eliminarDatoRecursivo(Nodo nodo, int dato) {
        if (nodo == null) {
            return null; // Si el nodo es nulo, no hay nada que eliminar
        }
        if (nodo.getDato() == dato) {
            return nodo.getNext(); // Si el dato coincide con el dato a eliminar, se retorna el siguiente nodo
        }
        nodo.setNext(eliminarDatoRecursivo(nodo.getNext(), dato)); // Se avanza recursivamente al siguiente nodo
        return nodo;
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
