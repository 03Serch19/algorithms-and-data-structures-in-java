import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
       LinkedList<Integer> list = new LinkedList<>();
       list.add(1); 
       list.add(22);
       list.add(34);
       list.add(4);
        list.add(2225);

        int tamanio = list.size();
        System.out.println("El tamaño de la lista es: " + tamanio); 
        int i = 0;
        while (i < tamanio) {
          System.out.println("Elemento " + i + ": " + list.get(i));
          i++;
        }
        list.remove(2);

        tamanio = list.size();
        System.out.println("El tamaño de la lista es: " + tamanio); 
        i = 0;
        while( i < list.size()) {
            System.out.println("Elemento " + i + ": " + list.get(i));
            i++;
        }
      list.add(2, 1000);
      tamanio = list.size();
      System.out.println("El tamaño de la lista es: " + tamanio); 
      i = 0;
      while( i < list.size()) {
          System.out.println("Elemento " + i + ": " + list.get(i));
          i++;
      }
      //list.sort(null);
    }
}
