import java.util.Scanner;
public class App {

      public static void main(String[] args) {
          ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
          Scanner scanner = new Scanner(System.in);
          int opcion;
  
          do {
              System.out.println("\n--- Menú del Árbol Binario ---");
              System.out.println("1. Insertar un nodo");
              System.out.println("2. Recorrer InOrden");
              System.out.println("3. Recorrer preOrden");
              System.out.println("4. Recorrer postOrden");
              System.out.println("5. Buscar elemento");
              System.out.println("6. Eliminar elemento");
              System.out.println("0. Salir");
              System.out.print("Ingrese su opción: ");
              opcion = scanner.nextInt();
              scanner.nextLine(); // Consumir la nueva línea después de leer el entero
  
              switch (opcion) {
                  case 1:
                      System.out.print("Ingrese el dato (entero) del nodo a insertar: ");
                      int datoInsertar = scanner.nextInt();
                      scanner.nextLine(); // Consumir la nueva línea
                      System.out.print("Ingrese el nombre del nodo a insertar: ");
                      String nombreInsertar = scanner.nextLine();
                      arbol.insertarVI(datoInsertar, nombreInsertar);
                      System.out.println("Nodo insertado.");
                      break;
               case 2:
                      if(arbol.estaVacio()){
                        System.out.println("El arbol esta vacio");
                      }else{
                       arbol.inOrden(arbol.raiz); 
                      }
               break;
               case 3:
               if(arbol.estaVacio()){
                 System.out.println("El arbol esta vacio");
               }else{
                arbol.preOrden(arbol.raiz); 
               }
                break;

                case 4:
                if(arbol.estaVacio()){
                  System.out.println("El arbol esta vacio");
                }else{
                 arbol.postOrden(arbol.raiz); 
                }
                 break;
                 case 5:
                if(arbol.estaVacio()){
                  System.out.println("El arbol esta vacio no hay nada que buscar");
                }else{
                  System.out.print("Ingrese el dato (entero) del nodo a buscar: ");
                  int  datoBuscar = scanner.nextInt();
                   NodoArbol buscado=arbol.buscar(datoBuscar);
                   if(buscado!=null)System.out.println(buscado.toString());
                   else System.out.println("El valor nno se encuentra en el arbol");
                }
                 break;
                 case 6:
                if(arbol.estaVacio()){
                  System.out.println("El arbol esta vacio no hay nada que eliminar");
                }else{
                  System.out.print("Ingrese el dato (entero) del nodo a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                  
                   if(arbol.eliminar(datoEliminar))System.out.println("Dato eliminado "+datoEliminar);
                   else System.out.println("El valor no se encuentra en el arbol");
                }
                 break;
                  case 0:
                      System.out.println("Saliendo del programa.");
                      break;
                  default:
                      System.out.println("Opción inválida. Intente de nuevo.");
              }
          } while (opcion != 0);
  
          scanner.close();
      
  }
}
