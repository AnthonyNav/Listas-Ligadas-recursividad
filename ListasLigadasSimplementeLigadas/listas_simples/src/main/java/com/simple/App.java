package com.simple;
import java.util.Scanner;

/**
 * Listas Simplemente Ligadas!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        ListaLSimple lista = new ListaLSimple();
        boolean salir = false;
        int opcion, oplist, posicion;
        Resultado resultado = new Resultado();
        
        do{
            System.out.println("Desea ingresar datos a la lista? \n1.Si \t 2.No");
            oplist = scan.nextInt();
            switch (oplist) {
                case 1:
                    System.out.println("Ingrese el dato: ");  
                    int dato = scan.nextInt();
                    lista.insertar(dato);
                    break;
                case 2:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opcion valida.");
                    break;
            }
        } while (oplist !=2);
        
        while (!salir) {
            System.out.println("Menu:");
            System.out.println("1. Calcular el mayor dato e indicar su posicion");
            System.out.println("2. Calcular el dato minimo y contar su cantidad de repeticiones");
            System.out.println("3. Sumar todos los datos de la lista recursivamente");
            System.out.println("4. Sumar los datos pares de la lista recursivamente");
            System.out.println("5. Visualizar los datos pares de la lista recursivamente");
            System.out.println("6. Mostrar los numeros primos de la lista");
            System.out.println("7. Buscar un dato en la lista recursivamente");
            System.out.println("8. Eliminar un dato de la lista recursivamente");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    // Opcion para calcular el mayor dato e indicar su posicion
                    resultado = lista.encontrarMayor(lista.getInicio());
                    System.out.println("El numero mayor es: " + resultado.numero);
                    System.out.println("Se encuentra en la posicion: " + resultado.i);
                    break;
                case 2:
                    // Opcion para calcular el dato mínimo y contar su cantidad de repeticiones
                    resultado = lista.encontrarMenor(lista.getInicio());
                    System.out.println("El numero menor es: " + resultado.numero);
                    System.out.println("El numero de iteraciones es: " + resultado.i);
                    break;
                case 3:
                    // Lógica para sumar todos los datos de la lista recursivamente
                    if (!lista.estaVacia()) {
                        System.out.println("La suma de los elementos es: " + lista.sumarTodos(lista.getInicio()));
                    } else {
                        System.out.println("Lista Vacia");
                    }
                    break;
                case 4:
                    // Lógica para sumar los datos pares de la lista recursivamente
                    if (!lista.estaVacia()) {
                        if (lista.verPares(lista.getInicio()) != "") {
                            System.out.println("La suma de los elementos pares es: " + lista.sumarPares(lista.getInicio()));
                        } else {
                            System.out.println("No hay elementos pares a sumar");
                        }
                    } else {
                        System.out.println("Lista Vacia");
                    }
                    break;
                case 5:
                    // Lógica para visualizar los datos pares de la lista recursivamente
                    if (!lista.estaVacia()) {
                        if (lista.verPares(lista.getInicio()) != "") {
                            System.out.println("Los elementos pares son: " + lista.verPares(lista.getInicio()));
                        } else {
                            System.out.println("No hay elementos pares");
                        }
                    } else {
                        System.out.println("Lista Vacia");
                    }
                    break;
                case 6:
                    if (lista.estaVacia()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.println("Numeros primos en la lista: " + lista.verPrimos());
                    }
                    break;
                case 7:
                    // Opcion para buscar un dato en la lista recursivamente, el metodo regresa la posicion en la que se encuentra
                    System.out.println("Ingresa el numero a buscar: ");
                    int dato = scan.nextInt();
                    posicion = lista.Buscar(lista.getInicio(), dato, 1);
                    if(posicion == -1)
                        System.out.println("Numero no encontrado ");
                    else 
                        System.out.println("Numero encontrado en la posicion: " + posicion);
                    
                    break;
                case 8:
                    if (lista.estaVacia()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.print("Ingrese el dato que desea eliminar: ");
                        int datoEliminar = scan.nextInt();
                        lista.eliminarDato(datoEliminar);
                        System.out.println("Lista actualizada: " + lista);
                    }
                    break;
                case 9:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
        scan.close();
    }
}

