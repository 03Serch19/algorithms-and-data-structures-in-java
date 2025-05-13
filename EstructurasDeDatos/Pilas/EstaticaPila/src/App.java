import javax.swing.JOptionPane;
//es una forma de representar una pila, pero la naturaleza dinamica de una pila, es naturalmente mejor representada mediante nodos
public class App {
    public static void main(String[] args) throws Exception {
         PilaEstatica pila = new PilaEstatica(5);
    int opcion = 0;
    int dato;
    try {
      do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elije la accion a realizar \n"
            +"1... Empujar un elemento la pila\n"+
             "2... Sacar un elemento de la pila\n" + 
             "3... ¿La pila esta vacia?\n" + 
             "4... ¿La pila esta llena?\n" + 
             "5...  ¿Que  elemento esta en la cima?\n" + 
             "6...  Vaciar pila\n" + 
             "7... Tamaño de la pila\n" + 
             "8...Mostrar pila\n9...Salir",
            "Menu", 1));
        switch (opcion) {
          case 1:
            if(!(pila.estaLlena())){
              dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en al pila", "Apilando Datos", 3));
            pila.empujar(dato);
           }else System.out.println("La pila esta llena");
            break;
          case 2:
          if(!(pila.estaVacia())){
            JOptionPane.showMessageDialog(null, "El elemento obtenido de la pila es "+pila.sacar(), "Desapilando Datos", 3);
         }else System.out.println("La pila esta vacia");
            break;
          case 3: 
          if(!(pila.estaVacia()))System.out.println("La pila  no esta vacia");         
          else System.out.println("La pila esta vacia");
            break;
            case 4:
            if(!(pila.estaLlena()))System.out.println("La pila no esta llena");
            else System.out.println("La pila esta llena");
            break;
            case 5:
            if(!(pila.estaVacia()))
            System.out.println("El elemento que esta en la cima es "+pila.cima());
           else System.out.println("La pila aun esta vacia, no hay ningun  elemento");
            break;
            case 6:
            if(!(pila.estaVacia()))pila.vaciar();        
            else System.out.println("La pila esta vacia");
            break;
            case 7:
            System.out.println("El tamaño de la pila es "+pila.tamaño());

            break;
            case 8:
          
          
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
