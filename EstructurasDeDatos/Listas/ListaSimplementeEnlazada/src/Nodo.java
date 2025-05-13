public class Nodo {
  public int dato;
  public Nodo siguiente;// Puntero enlace

  /*
   * Técnicamente no es necesario asignar null explícitamente a una variable de
   * referencia en el constructor si no se le asigna otro valor. Java lo hace por
   * defecto.
   * Hacerlo explícito puede mejorar la legibilidad y la claridad del código,
   * dejando claro que la referencia se inicializa intencionalmente como null.
   */
  // cosntructor para insertar al final
  public Nodo(int dato) {
    this.dato = dato;
    this.siguiente = null;//para mayor calridad se hace esto//pero en si, si no se le asigana null, pues al no asignarese nada por defeto java asume esta variable que apunte a null
  }

  // cosntructor para insertar al inicio
  public Nodo(int dato, Nodo siguiente) {
    this.dato = dato;
    this.siguiente = siguiente;
  }

}
