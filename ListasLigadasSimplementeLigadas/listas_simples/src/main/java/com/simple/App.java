package com.simple;

//import java.util.Scanner;

/**
 * Listas Simplemente Ligadas!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Se comento el menu simplemente para poder realizar las pruebas pertinentes directamente al codigo, se descomentara y refactorizara 
        // cuando esten listos los metodos para hacer las pruebas finales


//         Scanner scan = new Scanner(System.in);
//         ListaLSimple l1 = new ListaLSimple();
//         ListaLSimple l2 = new ListaLSimple();
//         ListaLSimple l3 = new ListaLSimple();
//         ListaLSimple auxl = l1;
//         String auxprint = "";
//         boolean salir = false;

//         int opcion, oplist;
//         while (!salir) {
//             System.out.println("Menú:");
//             System.out.println("0. Insertar elemento");
//             System.out.println("1. Calcular el mayor de los datos e indique la posición en que se encuentre");
//             System.out.println("2. Calcular el dato mínimo y cuente la cantidad de veces que se repite");
//             System.out.println("3. Sumar los datos de una lista recursivamente.");
//             System.out.println("4. Sumar los datos pares de una lista recursivamente");
//             System.out.println("5. Visualizar los datos pares de la lista recursivamente");
//             System.out.println("6. Mostrar los números primos de la lista");
//             System.out.println("7. Buscar un dato en la lista recursivamente");
//             System.out.println("8. Eliminar un dato recursivamente.");
//             System.out.println("9. Salir");
//             System.out.print("Elija una opción: ");
//             opcion = scan.nextInt();

//             if (opcion != 0 && opcion != 9) {
//                 // System.out.println("\nEstado de las listas");
//                 // auxprint = (l1.estaVacia()) ? " ":l1.imprimirElementos();
//                 // System.out.println("L1)" + auxprint);
//                 // auxprint = (l2.estaVacia()) ? " ":l2.imprimirElementos();
//                 // System.out.println("L2)" + auxprint);
//                 // System.out.println("\n");
//                 System.out.println("Seleccione una lista para realizar la accion: \n1) L1\n2) L2");
//                 oplist = scan.nextInt();
//                 auxl = (oplist == 1) ? l1:l2;
//             }

//             switch (opcion) {
//                 case 0:
//                     System.out.println("Menú de insercion:");
//                     System.out.println("1. Al inicio de la lista");
//                     System.out.println("2. Al final de la lista");
//                     System.out.println("3. A la derecha del elemento con información X");
//                     System.out.println("4. A la izquierda del elemento con información X");
//                     System.out.println("5. En la i-esima posición");
//                     System.out.println("6. De forma ordenada ascendentemente");
//                     System.out.print("Elija una opción: ");
//                     opcion = scan.nextInt();
//                     System.out.println("Ingrese el dato a insertar");

//                     switch (opcion) {
//                         case 1:
//                             auxl.insertarInicio(scan.nextInt());
//                             break;
//                         case 2:
//                             auxl.insertarFinal(scan.nextInt());
//                             break;
//                         case 3:
//                             if (!auxl.estaVacia()) {
//                                 opcion = scan.nextInt();  // Reutilizamos la variable opcion 
//                                 System.out.println("Dame el dato x:");
//                                 auxl.insertarDerX(opcion, scan.nextInt());
//                             } else {
//                                 System.out.println("No es posible buscar X si la lista esta vacia");
//                             }
//                             break;
//                         case 4:
//                             if (!auxl.estaVacia()) {
//                                 opcion = scan.nextInt();  // Reutilizamos la variable opcion 
//                                 System.out.println("Dame el dato x:");
//                                 auxl.insertarIzqX(opcion, scan.nextInt());
//                             } else {
//                                 System.out.println("No es posible buscar X si la lista esta vacia");
//                             }
//                             break;
//                         case 5:
//                             if (!auxl.estaVacia()) {
//                                 opcion = scan.nextInt();  // Reutilizamos la variable opcion 
//                                 System.out.println("Dame la posicion i:");
//                                 auxl.insertarIPos(opcion, scan.nextInt());
//                             } else {
//                                 System.out.println("No es posible ubicar el dato en la i-esima posicion si la lista esta vacia");
//                             }
//                             break;
//                         case 6:
//                             if (!auxl.estaVacia()) {
//                                 auxl.ascendente(scan.nextInt()); 
//                             } else {
//                                 auxl.insertarInicio(scan.nextInt());
//                             }
//                             break;
//                         default:
//                         System.out.println("Opcion no valida");
//                             break;
//                     }
//                     break;
//                 case 2:
                    
//                     break;
//                 case 3:
                    
//                     break;
//                 case 4:
                    
//                     break;
//                 case 5:
//                         break;
//                 case 9:
//                     salir = true;
//                     System.out.println("Saliendo...");
//                     break;
//                 default:
//                     System.out.println("Opcion no valida.");
//                     break;
//             }

//         } 
//         scan.close();
     }
}

