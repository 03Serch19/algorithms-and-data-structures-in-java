public class ListaCircularSimplementeEnlazada {
  NodoListaCircular ultimo;

  public ListaCircularSimplementeEnlazada() {
    ultimo = null;
  }

  // Método para saber cuando la lista esta vacia
  public boolean estaVacia() {
    return ultimo == null;
  }

  // metodo para insertar nodos
  public ListaCircularSimplementeEnlazada insertar(int elemento) {
    NodoListaCircular nuevo = new NodoListaCircular(elemento);
    if (!(estaVacia())) {
      nuevo.siguiente = ultimo.siguiente;
      ultimo.siguiente = nuevo;
    }
    ultimo = nuevo;
    return this;
  }

  // metodo para mostrar la lista
  public void mostraListaC() {
    NodoListaCircular aux = ultimo.siguiente;
    System.out.println("Mostrando datos");
    do {
      System.out.print(aux.dato + "----->");
      aux = aux.siguiente;
    } while (aux != ultimo.siguiente);
    System.out.println();
  }

  // metodo para eliminar de la lista//by me, ennesst ocasion la  dellviideoessalgodiiferetneademasqueahiretornarnunboeanyadeaemas sebasan en empezarconuna cicopara buscar elelmetno, esigreamentediferneteelroden a este perosilleganaahcerlalsmismasacciones,solloquecondifrentneordenypor diifetrentees formas
  public NodoListaCircular eliminar(int elemento) {
    NodoListaCircular nodoEliminar = null;
    if (elemento == ultimo.dato && ultimo == ultimo.siguiente) {
      nodoEliminar = ultimo;
      ultimo = null;
    } else if (elemento == ultimo.siguiente.dato) {
      nodoEliminar = ultimo.siguiente;
      ultimo.siguiente = ultimo.siguiente.siguiente;
    } else {
      NodoListaCircular anterior = ultimo.siguiente;
      NodoListaCircular aux = anterior.siguiente;
      while (aux != ultimo.siguiente && aux.dato != elemento) {
        anterior = aux;
        aux = aux.siguiente;
      }
      if (aux != ultimo.siguiente) {
        nodoEliminar = aux;
        if(aux==ultimo)ultimo=anterior;
        aux = aux.siguiente;
        anterior.siguiente = aux;
      } else nodoEliminar = null;
    }
    return nodoEliminar;
  }

}
