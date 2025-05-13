import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
       Queue<Integer> queue = new LinkedList<>();
     queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.add(4);
     // queue.clear();
     System.out.println("El inicio de la cola es "+queue.peek());
     System.out.println("El tamaño de la cola es "+queue.size());
     System.out.println("El primer elemento de la cola es "+queue.poll());//estamos  desencolando
    // System.out.println("El primer elemento de la cola es "+queue.remove());
     System.out.println("El inicio de la cola es "+queue.peek());
     System.out.println("El tamaño de la cola es "+queue.size());
    }
}
