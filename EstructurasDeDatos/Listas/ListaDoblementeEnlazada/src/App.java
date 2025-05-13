import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
         ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
    int opcion = 0;
    int dato;
    try {
      do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elije la accion a realizar \n"
            +"1... Agregar un elemento al inicio de la lista\n"+
             "2... Agregar un elemento al final de la lista\n" + 
             "3... Eliminar elemento del inicio de la lista\n" + 
             "4... Eliminar elemento del final de la lista\n" + 
             "5... Eliminar un elemento de la lista\n" + 
             "6... Buscar un elemento en la lista\n" + 
             "7... Mostrar lista de inicio a fin\n" + 
             "8... Mostrar lista de fin a  inicio\n9... Salir",
            "Menu", 1));
        switch (opcion) {
          case 1:
            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Insertando al inicio", 3));
            lista.agregarAlInicio(dato);
            break;
          case 2:
          dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Insertando al final", 3));
          lista.agregarAlFinal(dato);
            break;
          case 3:           
             if(lista.estaVacia())System.out.println("No hay elementos para eliminar");
            else System.out.println("Elemento "+ lista.eliminarNodoInicio().dato+ " eliminado");
            break;
            case 4:
            if(lista.estaVacia())System.out.println("No hay elementos para eliminar");
           else System.out.println("Elemento "+ lista.eliminarNodoFinal().dato+ " eliminado");
            break;
            case 5:
           if(lista.estaVacia())System.out.println("No hay elementos para eliminar");          
            else{
              dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar", "Eliminando elemento de  la  lista", 3));
              if(!(lista.buscarElementoEnLista(dato)))System.out.println("El elemento  "+dato+ " no existe en la lista");
              else System.out.println("Elemento "+lista.eliminarNodo(dato).dato+ " eliminado");          
             }
            break;
            case 6:
           dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a buscar", "Buscar elemento en la  lista", 3));
            if(lista.buscarElementoEnLista(dato)) System.out.println("El elemento  "+dato+ " existe en la lista");
            else System.out.println("El elemento  "+dato+ " no existe en la lista"); 
            break;
            case 7:
            lista.mostrarListaInicioFin();         
            break;
            case 8:
            lista.mostrarListaFinInicio();        
            break;
            case 9:
          
            break;
          default:
            JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            break;
        }
      } while (opcion != 9);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
}
