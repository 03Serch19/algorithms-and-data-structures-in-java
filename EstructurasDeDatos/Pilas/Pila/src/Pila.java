public class Pila {
  private NodoPila cima;
  private int tamanio;
  public Pila(){
    tamanio=0;
    cima=null;
  }
  //metodo para saber cuando la pila esta vacia
  public boolean isEmpty() {
    return cima==null;
  }
  //metodo pra empujarr un elemento en la pila
  public void push(int dato) {
    NodoPila nuevo=new NodoPila(dato);
    nuevo.siguiente=cima;
    cima=nuevo;  
    tamanio++;
  }
    //metodo para sacarr un elemento de la pila
    public NodoPila pop() {
      NodoPila eliminado= cima;
      if (!(isEmpty())) {
      cima=cima.siguiente;
      tamanio--;
    }
     return eliminado;
    }
    //metodo  parra dsaber   quiene sta ebn la ciima de la pila
    public NodoPila top() {
     return cima;
    }
      // metodo parra saber el tamño de la pila
  public int length() {
    return tamanio;
  }
    // metodo para limpiar pila
    public void clean() {
      cima = null;
      tamanio=0;
      /*while (!isEmpty()) {//forma porpuesta por el video
        pop();
      }*/
    }
}
