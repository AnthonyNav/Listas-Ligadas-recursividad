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

    // Metodos de insercion
    public void insertarInicio(int dato){

        if(this.estaVacia()){ // Si esta vacia, entonces solo hace referencia al nuevo nodo
            this.inicio = new Nodo(dato);
        } else {           // Si existen elemento, los desplaza y apunta al nuevo
            Nodo n = new Nodo(dato);
            n.setNext(this.inicio);
            this.inicio = n;
        }
    }

    public void insertarFinal(int dato){
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

    public boolean insertarDerX(int dato, int x){ 
        Nodo auxNodo = this.inicio;
        while (auxNodo.getNext() != null) { // nos ubicara en el nodo que contenga a x
            if (auxNodo.getDato() == x) {
                break;
            }
            auxNodo = auxNodo.getNext();   // o al ultimo nodo 
        }
        if (auxNodo.getDato() == x) { // En este caso se ubico a x y se inserto el dato
            Nodo n = new Nodo(dato);
            n.setNext(auxNodo.getNext());
            auxNodo.setNext(n);
            return true;
        } 
        return false;
    }

    public boolean insertarIzqX(int dato,int x){
        Nodo auxNodo = this.inicio; // Para encontrar x
        Nodo auxNodo2 = auxNodo; // nodo que esta antes de x
        while (auxNodo.getNext()!=null) { // Recorre la lista 
            if (auxNodo.getDato() == x) { // hasta maximo el ultimo nodo
                break; // Sale del ciclo si encuenta el dato
            }
            auxNodo2 = auxNodo;
            auxNodo = auxNodo.getNext();
        }
        if (auxNodo.getDato() == x) { // Se verifica si se encontro x
            if (auxNodo == this.inicio) { // si x es el primer nodo
                insertarInicio(dato); // insertamos al inicio
            } else {  // Sino solo 
                Nodo n = new Nodo(dato);
                n.setNext(auxNodo); // enlazamos usando el nodo x
                auxNodo2.setNext(n); // y nuestro nodo auxiliar
            }
            return true;
        }
        return false;
    }

    public boolean insertarIPos(int dato, int i){ 
        Nodo auxNodo = this.inicio; // Nodo indicador
        Nodo auxNodo2 = auxNodo; // Nodo auxiliar
        int counter = 1;
        while (auxNodo.getNext() != null) { // Recorre la lista
            if (counter == i) { // Cuenta las iteraciones
                break;          // para encontar a i
            }
            counter++;
            auxNodo2 = auxNodo;
            auxNodo = auxNodo.getNext();
        }
        if (counter == i) {
            if (i == 1) { // Caso de nodo inicio
                this.insertarInicio(dato);
            } else { // Demás casos
                Nodo n = new Nodo(dato);
                n.setNext(auxNodo);
                auxNodo2.setNext(n);
            }
            return true;
        }
        return false;
    }
// La funcion supone que esta previamente ordenada la lista y que no esta vacia
    public void ascendente(int dato){  
        Nodo auxNodo = this.inicio;

        while (auxNodo.getNext() != null) { // Recorre hasta encontrar 
            if (auxNodo.getDato() > dato) { // un valor mayor al dato proporcionado
                break;
            }
            auxNodo = auxNodo.getNext();
        }
        if (auxNodo.getDato() > dato) { // Si se encuentra, el dato se inserta antes de ese valor
            this.insertarIzqX(dato, auxNodo.getDato());
        } else {
            this.insertarFinal(dato);
        }
    }

     // Para visualizar el estado de la lista en las pruebas 
    public String imprimirElementos(){ // Asume que no esta vacia la lista
        String output = "";
        Nodo auxNodo = this.inicio;
        while (auxNodo.getNext() != null) { // Recorre la lista
            output = output + " " + auxNodo.getDato(); // concatena
            auxNodo = auxNodo.getNext();
        }
        output = output + " " + auxNodo.getDato(); // concatena el ultimo nodo
        return output; // Retorna nuestra cadena que representa los elementos existentes
    }

    public boolean estaVacia(){
        return inicio==null;
    }
    
    // Metodos indicados 


    
    
}
