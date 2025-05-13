public class NodoListaCircular {
   int dato;
  NodoListaCircular siguiente;
  public NodoListaCircular(int dato) {
    this.dato = dato;
    siguiente=this;
  }
  
}
