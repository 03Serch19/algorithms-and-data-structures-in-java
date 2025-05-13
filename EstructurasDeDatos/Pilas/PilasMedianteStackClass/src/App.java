import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();//no se recomienda usar Stack, 
        //se recomienda usar Deque o LinkedList
        stack.push(1);
        stack.add(2);  //al final ambos convergen en lo mismo
        stack.push(5);
        stack.push(4);
        stack.push(0);
        System.out.println("La cima de la pila es: " + stack.peek());
        System.out.println("La pila tiene " + stack.size() + " elementos.");


        System.out.println("Desapilando elementos..."+ stack.pop());

        //System.out.println("Desapilando elementos..."+ stack.removeFirst());
        System.out.println("La cima de la pila es: " + stack.peek());
        System.out.println("La pila tiene " + stack.size() + " elementos.");
    }
}
