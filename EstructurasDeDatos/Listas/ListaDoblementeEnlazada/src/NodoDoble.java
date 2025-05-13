public class NodoDoble {
  public int dato;
  NodoDoble siguiente, anterior;

  //cosntructor par acuando no hay nodos
  public NodoDoble(int dato) {
    this(dato, null, null);
  }
  
  //constructor  para cuando  ya  hay nodos
  public NodoDoble(int dato, NodoDoble siguiente, NodoDoble anterior) {
    this.dato = dato;
    this.siguiente = siguiente;
    this.anterior = anterior;
  }


  
}
