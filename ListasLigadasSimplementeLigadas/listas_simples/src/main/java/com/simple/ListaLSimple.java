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
        return 0; // Si el nodo es null, entonces retornarÃ¡ 0
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

    public String verPrimos() {
        Nodo auxNodo = inicio;
        String primos = "";

        while (auxNodo != null) {
            if (esPrimo(auxNodo.getDato())) {
                primos += auxNodo.getDato() + " ";
            }
            auxNodo = auxNodo.getNext();
        }

        return primos;
    }

    public boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
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
    
    // Método recursivo para encontrar el número mayor y su posición
    public Resultado encontrarMayor(Nodo nodo) 
    {
        // Caso base: Si el nodo es nulo, retornar un valor sentinela
        if (nodo == null) 
        {
            return new Resultado(Integer.MIN_VALUE, 0); // Número menor posible y posición inválida
        }

        // Llamada recursiva con el siguiente nodo en la lista
        Resultado siguienteResultado = encontrarMayor(nodo.getNext());
        
        // Comparar el valor actual con el número mayor encontrado hasta ahora
        if (nodo.getDato() > siguienteResultado.numero) 
        {
            // Si el valor actual es mayor, actualizar el número mayor y su posición
            return new Resultado(nodo.getDato(), 1);
        } 
        else 
        {
            // Si el valor actual no es mayor, mantener el número mayor y su posición actual
            return new Resultado(siguienteResultado.numero, siguienteResultado.i + 1);
        }
    }
    
    // Método recursivo para encontrar el número menor y mostrar las iteraciones
    public Resultado encontrarMenor(Nodo nodo) 
    {
        // Caso base: Si el nodo es nulo, retornar un valor sentinela
        if (nodo == null) 
        {
            return new Resultado(Integer.MAX_VALUE, 0); // Número mayor posible y posición inicial
        }

        // Llamada recursiva con el siguiente nodo en la lista
        Resultado siguienteResultado = encontrarMenor(nodo.getNext());
        
        // Comparar el valor actual con el número menor encontrado hasta ahora
        if (nodo.getDato() < siguienteResultado.numero) 
        {
            // Si el valor actual es menor, actualizar el número menor y se incrementa el registro de las iteraciones
            return new Resultado(nodo.getDato(), siguienteResultado.i + 1);
        } 
        else 
        {
            // Si el valor actual no es menor, mantener el número menor y se incrementa el registro de las iteraciones
            return new Resultado(siguienteResultado.numero, siguienteResultado.i + 1);
        }
    }

    //Metodo recursivo para encontrar un numero
    public int Buscar(Nodo n, int num, int i) //en la variable i se llevara el registro de las iteraciones
    {
        if(n != null) //se verifica que el nodo tenga informacion
        {
          if(num!=n.getDato())
          {
              //En caso de que el valor del nodo actual no sea el que se busca se hace la llamada recursiva con el siguiente nodo y se incrementa i
              return Buscar(n.getNext(), num, i+1);
          }
          else
          {
              return i; //Si se encuentra el numero, entonces se termina el metodo y se regresa i, que indica la posicion del dato en la lista ligada
          }
        }
        return -1; //en caso de no encontrar el numero en la lista se retorna -1
    }
}
