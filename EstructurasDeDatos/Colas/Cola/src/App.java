import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
         Cola  cola = new Cola();
    int opcion = 0;
    int dato;
    try {
      do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elije la accion a realizar \n"
            +"1... Encolar un  elemento\n"+
             "2... Desencolar\n" + 
             "3... ¿La cola esta vacia?\n" + 
             "4... ¿Que  elemento esta al frente?\n" +  
             "5... Tamaño de la cola\n" + 
             "6...  Mostrar cola\n7...Salir",
            "Menu", 1));
        switch (opcion) {
          case 1:
              dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a encolar ", "Encolando Datos", 3));
            cola.add(dato);
            break;
          case 2:
          if(!(cola.isEmpty())){    
            JOptionPane.showMessageDialog(null, "El elemento obtenido de la cola es "+cola.remove().dato, "Desencolando Datos", 3);
         }else System.out.println("La cola esta vacia");
            break;
          case 3: 
          if(!(cola.isEmpty()))System.out.println("La cola no esta vacia");      
          else System.out.println("La cola esta vacia");
            break;
            case 4:
            if(!(cola.isEmpty()))System.out.println("El elemento que esta al frente es "+cola.inicioCola().dato);
            else System.out.println("La cola aun esta vacia, no hay ningun  elemento"); 
            break;
            case 5:    
           System.out.println("El tamaño de la cola es "+cola.length());
            break;
            case 6:

            break;
            case 7:
          
          
            break;
          default:
            JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            break;
        }
      } while (opcion != 7);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
}
