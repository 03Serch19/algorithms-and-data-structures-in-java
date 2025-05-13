import javax.swing.JOptionPane;

public class App {
        public static void main(String[] args) throws Exception {
         Pila pila = new Pila();
    int opcion = 0;
    int dato;
    try {
      do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elije la accion a realizar \n"
            +"1... Empujar un elemento la pila\n"+
             "2... Sacar un elemento de la pila\n" + 
             "3... ¿La pila esta vacia?\n" + 
             "4... ¿Que  elemento esta en la cima?\n" + 
             "5...  Vaciar pila\n" + 
             "6... Tamaño de la pila\n" + 
             "7...  Mostrar pila\n8...Salir",
            "Menu", 1));
        switch (opcion) {
          case 1:
              dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en al pila", "Apilando Datos", 3));
            pila.push(dato);
            break;
          case 2:
          if(!(pila.isEmpty())){
            JOptionPane.showMessageDialog(null, "El elemento obtenido de la pila es "+pila.pop().dato, "Desapilando Datos", 3);
         }else System.out.println("La pila esta vacia");
            break;
          case 3: 
          if(!(pila.isEmpty()))System.out.println("La pila  no esta vacia");         
          else System.out.println("La pila esta vacia");
            break;
            case 4:
            if(!(pila.isEmpty()))
            System.out.println("El elemento que esta en la cima es "+pila.top().dato);
           else System.out.println("La pila aun esta vacia, no hay ningun  elemento");
            break;
            case 5:
            if(!(pila.isEmpty()))pila.clean();      
            else System.out.println("La pila esta vacia");
            break;
            case 6:    
           System.out.println("El tamaño de la pila es "+pila.length());
            break;
            case 7:

            break;
            case 8:
          
          
            break;
          default:
            JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            break;
        }
      } while (opcion != 8);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
}
